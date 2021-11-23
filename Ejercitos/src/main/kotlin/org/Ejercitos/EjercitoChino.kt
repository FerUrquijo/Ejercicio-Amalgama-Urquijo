package org.Ejercitos
import org.Unidades.*

class EjercitoChino : Ejercito() {
    init {
        this.agregarUnidades({Piquero()}, 2)
        this.agregarUnidades({Arquero()}, 25)
        this.agregarUnidades({Caballero()}, 2)
    }
}