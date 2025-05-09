package com.ruso.cfp401.cursoaplicacionesmoviles

fun main(){
    clasificacionEdad(7865)
}

fun clasificacionEdad(edad: Int){
    when(edad){
        in 0..12 -> println ("Niño")
        in 13..17-> println ("Adolescente")
        in 18..64-> println ("Adulto")
        in 65..120-> println ("Adulto mayor")
        else -> println("Domado pa")
    }
}


