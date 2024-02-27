package com.pga.bases

fun main() {
    //FOR en RANGOS
    for (i in 1..10) {
        println("i is $i")
    }

    for (i in 1..10 step 2) {
        println("(step) i es $i")
    }

    for (i in 10 downTo 1) {
        println("(down) i es $i")
    }

    for (i in 0 until 10) {
        println("(until) i es $i")
    }
    //FOR SOBRE ARRAYS
    val NUMEROS_INT = arrayOf(1, 5, 7, 8, 19, 34)

    for(num in NUMEROS_INT) {
        println("Numero es: $num")
    }

    for((index, num) in NUMEROS_INT.withIndex()){
        println("Numero es: $num en la posicion $index")
    }

    //FOR COMO iterador
    val gente = HashMap<String, Int>()

    gente["Paco"] = 40
    gente["Alex"] = 31
    gente["Juan"] = 33

    for((nombre, edad) in gente) {
        println("$nombre is $edad")
    }
}