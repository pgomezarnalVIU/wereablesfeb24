package com.pga.bases

fun main(args: Array<String>) {
    println("Bienvenido al paquete de Introducción Kotlin")

    println()
    var value: Int = sum(23, 42)
    println(value)

    println()
    value = sum2(26, 47)
    println(value)

    doNothing()

    //Named Arguments
    reformat(
        "paco!",
        false,
        upperCaseFirstLetter = false,
        divideByCamelHumps = true,
        '_'
    )
    //Named Arguments no llamando a los parámetros por defecto
    reformat("Esta es una frase larga")
    reformat("This is a short String!", upperCaseFirstLetter = false, wordSeparator = '_')

    //Uso infix
    val producto = 20 multiplicarPor 5
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sumaDosParametros(a: Int, b: Int): Int {
    return a + b
}
fun sumPonderada(a: Int, b: Int, ponderaA:Int=1, ponderaB:Int=1): Int {
    return ponderaA*a + ponderaB*b
}
fun sum2(a: Int, b: Int) = a + b

fun doNothing()  {
    println("Sin parámetros")
}

//Función con múltiples parámetros y parámetros por defecto
fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) { /*...*/ }

//Función con infix
infix fun Int.multiplicarPor(factor: Int) = this * factor