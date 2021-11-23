package org.Unidades

import kotlin.properties.Delegates

abstract class Unidad (){

    var fuerzaObtenida : Int = 0

    abstract fun fuerzaBase(): Int
    abstract fun costoDeEntrenamiento() : Int
    abstract fun aumentoPorEntrenamiento() : Int
    abstract fun costoTransformacion() : Int
    abstract fun transformar() : Unidad

    fun fuerza(): Int {
        return this.fuerzaBase() + this.fuerzaObtenida
    }

    fun entrenar(){
        this.fuerzaObtenida + this.aumentoPorEntrenamiento()
    }


}