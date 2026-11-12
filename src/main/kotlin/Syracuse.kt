package org.exemple

fun main() {
    var n = 12

    println("Calcul de la suite de Syracuse pour u0 = $n :")
    print("$n ")

    while (n > 1) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = 3 * n + 1
        }
        print("$n ")
    }
    println()
}
