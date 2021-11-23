package org.Ejercitos

import org.Unidades.*

class EjercitoBizantino : Ejercito(){
    init {
        this.agregarUnidades({ Piquero() }, 5)
        this.agregarUnidades({ Arquero() }, 8)
        this.agregarUnidades({ Caballero() }, 15)
    }
}