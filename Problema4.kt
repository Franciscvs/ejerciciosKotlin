package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    var max = Int.MIN_VALUE
    var indiceMax = 0
    var indice = 1
    var num: Int

    do {
        num = readLine()!!.toInt()
        if (num > max) {
            max = num
            indiceMax = indice
        }
        indice++
    } while (num != 0)

    println(indiceMax)
}