package org.Ejercitos

import org.Batalla
import org.Unidades.Unidad

abstract class Ejercito {

    private var unidades : MutableList<Unidad> = mutableListOf()
    private var monedasDeOro : Int = 1000
    private var batallas : MutableList<Batalla> = mutableListOf()


    fun batallar(ejercitoEnemigo : Ejercito){
        this.validarCantidadDeUnidades()
        ejercitoEnemigo.validarCantidadDeUnidades()
        val batalla : Batalla = Batalla(this, ejercitoEnemigo)
        batalla.resolver()
    }

    fun validarCantidadDeUnidades(){
        if(this.unidades.size == 0){
            throw(Error("Este ejercito no cuenta con unidades"))
        }
    }

    fun registrarBatalla(batalla: Batalla){
        this.batallas.add(batalla)
    }

    fun ganarMonedasDeOro(cantidad : Int){
        this.monedasDeOro += cantidad
    }

    fun perderMonedasDeOro(cantidad: Int){
        this.monedasDeOro -= cantidad
    }

    fun fuerza(): Int {
        return this.unidades.sumOf { it.fuerza() }
    }

    fun perderUnidadMasFuerte(){
        val unidadAEliminar = this.unidadMasFuerte()

        if(unidadAEliminar != null){
            this.eliminarUnidad(unidadAEliminar)
        }
    }

    private fun unidadMasFuerte() : Unidad?{
        return this.unidades.maxByOrNull { it.fuerza() }
    }

    fun agregarUnidad(unidad : Unidad){
        this.unidades.add(unidad)
    }

    private fun eliminarUnidad(unidad: Unidad){
        this.unidades.remove(unidad)
    }

    fun entrenar(unidad : Unidad){
        this.validarPertenencia(unidad)
        this.validarCantidadDeOro(unidad.costoDeEntrenamiento())
        this.perderMonedasDeOro(unidad.costoDeEntrenamiento())
        unidad.entrenar()
    }

    fun transformar(unidad: Unidad){
        this.validarPertenencia(unidad)
        this.validarCantidadDeOro(unidad.costoTransformacion())
        this.perderMonedasDeOro(unidad.costoTransformacion())
        this.agregarUnidad(unidad.transformar())
        this.eliminarUnidad(unidad)
    }


    private fun validarCantidadDeOro(cantidad: Int){
        if(this.monedasDeOro < cantidad){
            throw(Error("El ejercito no cuenta con las suficientes monedas para realizar el entrenamiento"))
        }
    }

    private fun validarPertenencia(unidad: Unidad){
        if(!this.unidades.contains(unidad)){
            throw(Error("La unidad dada no pertenece a este Ejercito"))
        }
    }

    fun agregarUnidades(unidad : () -> (Unidad), cantidad: Int){
        for(i in (0 until cantidad)){
            this.agregarUnidad(unidad())
        }
    }

}