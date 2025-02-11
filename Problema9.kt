package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    val n = readLine()!!.toInt()

    if (n <= 0) {
        println("Error")
        return
    }

    var suma = 0

    for (i in 1..n) {
        var factorial = 1

        for (j in 1..i) {
            factorial *= j
        }

        suma += factorial
    }

    println(suma)
}