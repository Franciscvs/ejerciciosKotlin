package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    var contadorPares = 0
    var num: Int

    do {
        num = readLine()!!.toInt()
        if (num % 2 == 0 && num != -1) {
            contadorPares++
        }
    } while (num != -1)


    println(contadorPares)
}