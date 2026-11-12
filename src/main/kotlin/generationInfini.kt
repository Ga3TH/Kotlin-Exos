package org.exemple

fun main() {
    val puissancesDeDeux = generateSequence(1) { it * 2 }
    val dixPremieres = puissancesDeDeux.take(10).toList()
    println("Les 10 premières puissances de 2 : ${dixPremieres.joinToString(", ")}")
}

