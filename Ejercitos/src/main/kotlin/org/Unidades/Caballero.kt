package org.Unidades

import java.lang.Error

class Caballero : Unidad() {
    override fun fuerzaBase(): Int {
        return 20
    }

    override fun costoDeEntrenamiento(): Int {
        return 30
    }

    override fun aumentoPorEntrenamiento(): Int {
        return 10
    }

    override fun costoTransformacion(): Int {
        return 0
    }

    override fun transformar(): Unidad {
       throw(Error("Esta unidad no puede transformarse"))
    }


}
