package org.exemple

import kotlin.math.pow

fun main() {
    val indices = (0..4)
    val suite = indices.map { n -> 1.0 / Math.pow(2.0, n.toDouble()) }
    suite.forEach { terme -> println(terme) }
}
