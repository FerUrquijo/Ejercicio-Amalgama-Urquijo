package org

import org.Ejercitos.Ejercito

class Batalla(val ejercitoAtacante: Ejercito, val ejercitoDefensor: Ejercito) {

    fun resolver() {
        if(ejercitoDefensor.fuerza() > ejercitoAtacante.fuerza()){
            this.resolverBatallaConGanador(ejercitoDefensor,ejercitoAtacante)
        }else if(ejercitoAtacante.fuerza() > ejercitoDefensor.fuerza()){
            this.resolverBatallaConGanador(ejercitoAtacante,ejercitoDefensor)
        }else{
            this.resolverBatallaEmpatada()
        }
    }

    private fun resolverBatallaEmpatada() {
        this.registroDeBatalla()
        ejercitoAtacante.perderUnidadMasFuerte()
        ejercitoDefensor.perderUnidadMasFuerte()
    }

    private fun resolverBatallaConGanador(ejercitoGanador: Ejercito, ejercitoPerdedor: Ejercito) {
        this.registroDeBatalla()
        this.penalizarPerdedor(ejercitoPerdedor)
        this.bonificarGanador(ejercitoGanador)
    }

    private fun bonificarGanador(ejercitoGanador: Ejercito) {
        ejercitoGanador.ganarMonedasDeOro(100)
    }

    private fun penalizarPerdedor(ejercitoPerdedor: Ejercito) {
        for(i in (0..1)){
            ejercitoPerdedor.perderUnidadMasFuerte()
        }
    }

    private fun registroDeBatalla(){
        ejercitoDefensor.registrarBatalla(this)
        ejercitoAtacante.registrarBatalla(this)
    }

}
