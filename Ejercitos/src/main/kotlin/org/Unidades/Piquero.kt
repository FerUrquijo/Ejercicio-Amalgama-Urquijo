package org.Unidades

class Piquero() : Unidad(){

    override fun fuerzaBase(): Int {
        return 5
    }

    override fun costoDeEntrenamiento(): Int {
        return 10
    }

    override fun aumentoPorEntrenamiento(): Int {
        return 3
    }

    override fun costoTransformacion(): Int {
        return 30
    }

    override fun transformar(): Unidad {
        return Arquero()
    }

}