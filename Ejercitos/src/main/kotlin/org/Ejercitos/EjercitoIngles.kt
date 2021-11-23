package org.Ejercitos

import org.Unidades.*

class EjercitoIngles : Ejercito() {
    init {
        this.agregarUnidades({ Piquero() }, 10)
        this.agregarUnidades({ Arquero() }, 10)
        this.agregarUnidades({ Caballero() }, 10)
    }
}