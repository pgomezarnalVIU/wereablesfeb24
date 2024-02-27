package com.pga.poo

fun main() {

    //No es necesario usar new
    val vacia = Vacia()
    val paco = Persona()

    //Uso
    paco.nombre = "Paco"
    println("Mi nombre es ${paco.nombre}")
    paco.alimentaMe("desayuno")

    //Uso animal
    val nuevoAnimal = Animal()
    nuevoAnimal.nombre = "Zoser"
    // Daría un error
    // nuevoAnimal.esHumano=false

}

//Se pueden definir clases vacias
class Vacia

//Las classes tienen propiedades y métodos
class Persona {
    var nombre: String = ""
    var calorias = 0

    fun alimentaMe(comida: String) {
        println("$nombre ha sido alimentado con $comida")
        actualizaCalorias(100)
    }
    fun actualizaCalorias(calorias: Int) {
        this.calorias += calorias //El uso de this permite distinguir entre el parametro de entrada y el de clase
    }
}

//Clase con propiedades que se pueden modifiar y no modifiables
class Animal {
    var nombre = ""
    val esHumano = true
}