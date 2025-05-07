package com.ruso.cfp401.cursoaplicacionesmoviles

fun main (){

    compararNombres("thiago","thiago")
    compararNombres("thiago","kaiser")
}

fun compararNombres(nombre1: String, nombre2: String){

    if (nombre1 == nombre2) println("son lo mismo bro")
    else println("nada que ver bro")
}

fun condicionalConReturn(edad:Int, permiso: Boolean): String{
    return if("pepe" == "pepe") "Son 2 pepes"
    else "no son los dos pepes"
}

fun sacarRegistro(edad: Int, permiso: Boolean): String{
    var mensaje: String
    if(edad >= 18){
        mensaje = "Usted puede sacar el registro"
    } else {
        if (permiso) mensaje = "Usted puede sacar el registro"
        else "Vuelva cuando tenga permiso"
    }
}

fun main() {
    println(sacarRegistro(18, false))
    println(sacarRegistro(16, false))
    println(sacarRegistro(17, true))
}