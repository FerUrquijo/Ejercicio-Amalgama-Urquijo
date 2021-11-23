package org.Unidades

class Arquero : Unidad() {

    override fun fuerzaBase(): Int {
        return 10
    }
    override fun costoDeEntrenamiento(): Int {
        return 20
    }

    override fun aumentoPorEntrenamiento(): Int {
        return 7
    }

    override fun costoTransformacion(): Int {
        return 40
    }

    override fun transformar(): Unidad {
        return Caballero()
    }

}
