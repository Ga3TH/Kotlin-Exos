package org.exemple

import kotlin.math.sin
import kotlin.math.PI
fun integrer(a: Double, b: Double, n: Int, f: (Double) -> Double): Double {
    val h = (b - a) / n
    var somme = 0.0

    for (i in 1..n) {
        val xi = a + (i - 0.5) * h
        somme += f(xi)
    }

    return h * somme
}

fun main() {
    val res1 = integrer(0.0, 1.0, 1000) { x -> x }
    println("Intégrale de x sur [0,1] : $res1")

    val res2 = integrer(0.0, 1.0, 1000) { x -> x * x }
    println("Intégrale de x² sur [0,1] : $res2")

    val res3 = integrer(0.0, PI, 1000) { x -> sin(x) }
    println("Intégrale de sin(x) sur [0,π] : $res3")
}
