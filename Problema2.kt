package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    var dias = 1
    var distanciaRecorrida = x.toDouble()

    while (distanciaRecorrida < y) {
        distanciaRecorrida *= 1.1
        dias++
    }

    println(dias)
}