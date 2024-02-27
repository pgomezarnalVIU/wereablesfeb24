package com.pga.poo

fun main() {

    //Persona sin nombre
    val desconocido = SuperPersona()
    //desconocido.nombre = "" //Causa una excepcion
    //println("Mi nombre es ${desconocido.nombre}")

    //Uso
    val paco = SuperPersona()
    paco.nombre = "Paco"
    println("Mi nombre es ${paco.nombre}")
    println("${paco.nombre} ha comido? ${paco.haComido}")
    paco.alimentaMe("desayuno")
    println("${paco.nombre} ha comido? ${paco.haComido}")


}

//Clase Persona
class SuperPersona {
    var nombre: String = ""
        //Sería redundante ya que justamente es lo que hace el getter
        // get() = field
        set(value) {
            if(value.isEmpty()) throw Exception()
            field = value
        }

    var calorias = 0

    val haComido : Boolean
        get() = calorias != 0

    fun alimentaMe(comida: String) {
        println("$nombre ha sido alimentado con $comida")
        actualizaCalorias(100)
    }
    fun actualizaCalorias(calorias: Int) {
        this.calorias += calorias
    }
}