package com.pga.poo

fun main() {

    val paco = PersonaConPrimSec("Paco")
    val juan = PersonaConPrimSec("Juan", 23)

    println("${paco.nombre} has id ${paco.id}")
    println("${juan.nombre} has id ${juan.id}")

}


// Clase con primario y secundario con valores por defecto
class PersonaConPrimSec(var nombre: String, var id: Int = 0, var edad: Int = 0) {

    constructor(nombre: String, id: Int) : this(nombre) {
        // access database
        println("In secondary constructor")
    }


}

// Clase con primario y secundario
//class Persona(var nombre: String) {
//
//    var id = 0
//
//    constructor(nombre: String, id: Int) :this(nombre) {
//        this.id = id
//    }
//
//    constructor(nombre: String, id: Int, edad: Int) :this(nombre, id)
//
//}