package com.pga.bases

fun main() {
    val TIPO_BYTE:Byte = 1
    val TIPO_SHORT:Short = 128
    val TIPO_INFERIDO_NUM = 8

    //Conocer el tipo de una variable
    println(TIPO_INFERIDO_NUM::class.simpleName)

    val TIPO_LONG:Long = 35000000
    val TIPO_LONG_VISUAL:Long = 3_500_000_000

    println(TIPO_LONG_VISUAL)

    val TIPO_FLOAT:Float = 3.14f
    val CONST_HEXADECIMAL = 0xfff
    val CONST_BINARIO = 0b0001001111

    println(CONST_HEXADECIMAL::class.simpleName)
    println(CONST_BINARIO::class.simpleName)

    //Conversiones numéricas
    var division:Int = 48/3
    var divisionDecimal:Double = 47/3.toDouble()

    println("Resultado division $division entera")
    println("Resultado division $divisionDecimal double")

}