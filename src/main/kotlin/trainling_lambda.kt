package org.exemple

// Définition de la fonction repeter
fun repeter(fois: Int, action: (Int) -> Unit) {
    for (i in 1..fois) {
        action(i)
    }
}

fun main() {
    // Appel de repeter avec une trailing lambda
    repeter(3) { i ->
        println("Tour n$i")
    }
}
