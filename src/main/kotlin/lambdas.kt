package org.exemple

fun main() {
// 1. Une lambda qui prend un Int et retourne son double
    val doubler: (Int) -> Int = { x -> x * 2 }
    println(doubler(5))     // attendu : 10

// 2. Une lambda qui prend deux Int et retourne leur somme
    val additionner: (Int, Int) -> Int = { a, b -> a + b }
    println(additionner(3, 4)) // attendu : 7

// 3. Une lambda sans paramètre qui retourne "Bonjour"
    val saluer: () -> String = { "Bonjour" }
    println(saluer())      // attendu : Bonjour
}
