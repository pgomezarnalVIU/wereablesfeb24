package com.pga.bases

fun main(args: Array<String>) {
    //CReacion Strings
    var nombre = "Paco"
    var edad = 40

    //Impresión
    val primerMensaje = "Mi nombre es ${nombre.uppercase()} y mi edad $edad"
    val segundoMensaje = "Mi nombre es ${nombre.lowercase()} y mi edad  $edad"

    println(primerMensaje)
    println(segundoMensaje)
}