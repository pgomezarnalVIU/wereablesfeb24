package com.pga.poo

fun main() {

    //Uso
    val paco = SuperPersonaOculta()
    paco.nombre = "Paco"
    // paco.calorias = 100 nos da un error en el setter
    println("Mi nombre es ${paco.nombre}")
    println("${paco.nombre} ha comido? ${paco.haComido}")
    paco.alimentaMe("desayuno")
    println("${paco.nombre} ha comido? ${paco.haComido}")


}

//Clase Persona
class SuperPersonaOculta {
    var nombre: String = ""
        //Sería redundante ya que justamente es lo que hace el getter
        // get() = field
        set(value) {
            if(value.isEmpty()) throw Exception()
            field = value
        }

    //Hacemos privada la propiedad al completo
    //private var calorias=0
    var calorias = 0
        //Hacemos privada el setter unicamente calorias
        private set(value) {
            field = value
        }

    val haComido : Boolean
        get() = calorias != 0

    fun alimentaMe(comida: String) {
        println("$nombre ha sido alimentado con $comida")
        actualizaCalorias(100)
    }
    //Método que solo se puede usar internamente a la Clase
    private fun actualizaCalorias(calorias: Int) {
        this.calorias += calorias
    }
}