package com.pga.bases

fun main() {
    var contador = 3
    println("-----BLOQUE do-while-----")

    //DO-WHILE
    do {
        println("El contador actual es $contador")
        contador--

    } while (contador > 1)

    contador = 5
    println("-----BLOQUE while-----")
    while (contador > 1) {
            println("El contador actual es $contador")
            contador--
            if(contador < 3) break
    }

}