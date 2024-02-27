package com.pga.bases

fun main(args: Array<String>) {
    //Creación de arrays
    val ARRAY_INT = intArrayOf(1, 2, 3, 4, 5)
    val ARRAY_FLOAT = floatArrayOf(2f,4f,5f,6f)
    val SIMPLE_ARRAY = arrayOf(1, 2, 3)
    val ARRAY_STR = arrayOf("Paco", "Pepe")

    println("Nombres ${ARRAY_STR[0]}  ${ARRAY_STR[1]}")

    //Modificacion
    ARRAY_STR[1] = "Pedro"
    println("Nombres ${ARRAY_STR[0]}  ${ARRAY_STR[1]}")

    //Listas mutables
    val LISTA_INTEGER = arrayListOf<Int>()
    println("LISTA_INTEGER.isEmpty() es ${LISTA_INTEGER.isEmpty()}") // true

    LISTA_INTEGER.addAll(listOf(1, 2, 3))
    println(LISTA_INTEGER) // [1, 2, 3]
}