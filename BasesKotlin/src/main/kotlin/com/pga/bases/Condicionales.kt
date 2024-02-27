package com.pga.bases

fun main() {
    val contador = 6

    when(contador) {
        1 -> println("Contador es 1")
        3 -> println("Contador es 3")
        4, 5 -> println("Contador es 4 o 5")
        in 6..10 -> println("Contador dentro del rango 6 a 10")
        !in 10..20 -> println("Contador no está dentro del rango 10 a 20")
        else -> {
            println("No conocemos el valor del contador")
        }
    }
}

fun usandoIf() {
    val contador = 6

    if (contador < 5) {
        println("Contador es menor que 5")
    } else if (contador < 10){
        println("Contador es menor que 10")
    } else {
        println("Contador es mayor que 10")
    }

}