package com.pga.poo

fun main() {

    //Utilizando el constructor primario
    val paco = PersonaConstructor("Sin Nombre", 23)
    paco.nombre = "Paco"

    println("La persona tiene el nombre '${paco.nombre}' y el  id '${paco.idValue}'")
    //Usando el getter/setter
    val pacoC = PersonaConGetter("PacoC", 23)
    pacoC.id = -34
    println("La persona tiene el nombre '${pacoC.nombre}' y el  id '${pacoC.id}'")

}

class PersonaConstructor(var nombre: String, private val id: Int) {

    val idValue
        get() = id
}

class PersonaConGetter(var nombre: String, id: Int) {

    var id = id
        get() = field
        set(value) {
            if (value > 0) field = value
            else field = 0
        }
}
