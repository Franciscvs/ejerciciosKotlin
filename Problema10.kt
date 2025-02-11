package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 10 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    val n = readLine()!!.toInt()


    if (n <= 0 || n > 9) {
        println("Error")
        return
    }

    for (i in 1..n) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}