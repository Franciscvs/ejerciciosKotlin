package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    val N = readLine()!!.toInt()

    if (N <= 0) {
        println("Error")
        return
    }

    var suma = 0

    for (i in 1..N) {
        suma += i * i * i
    }

    println(suma)
}