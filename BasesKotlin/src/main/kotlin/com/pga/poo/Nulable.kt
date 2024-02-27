package com.pga.poo

fun main() {

    //Permite definir una variable como tipo nulo
    var nombreNulable:String?=null
    var nombre:String=""

    //Produce un error
    //nombre=null

    //Produce un error al intentar asignar un nulo a una variable no nulable
    //nombre=nombreNulable
    nombreNulable=nombre

    val o = Organizer()

    o.closeMeeting(Meeting())
    o.closeNullableMeeting(Meeting())
    o.closeNullableMeeting(null)

    var m1 : Meeting? = null
    var m2 = Meeting()

    //Operador Elvis
    m2 = m1 ?: Meeting()

}

class Organizer {
    fun closeMeeting(m: Meeting) {
        m.close()
    }

    //Se define la función para permitir pasar un nulo
    fun closeNullableMeeting(m: Meeting?) {
        //Se debe proteger la llamada con el operador nulable para no producir una excepción
        m?.close()
    }

}

class Meeting{
    fun close() {
        println("Meeting closed")
    }
}