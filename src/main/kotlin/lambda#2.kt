package org.exemple

fun calculer(x: Double, f: (Double) -> Double): Double {
    return f(x)
}

fun main() {

    val carre = calculer(3.5) { x -> x * x }
    println("Carré de 3.5 : $carre")


    val cube = calculer(2.0) { x -> x * x * x }
    println("Cube de 2.0 : $cube")

    val inverse = calculer(4.0) { x -> 1.0 / x }
    println("Inverse de 4.0 : $inverse")

    val oppose = calculer(7.2) { x -> -x }
    println("Opposé de 7.2 : $oppose")

    val valeurAbsolue = calculer(-6.5) { x ->
        if (x < 0) -x else x
    }
    println("Valeur absolue de -6.5 : $valeurAbsolue")
}
