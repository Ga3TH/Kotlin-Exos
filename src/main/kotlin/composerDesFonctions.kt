fun main() {
    val resultat1 = appliquerDeuxFois(5.0) { x -> x + 10.0 }
    println("f(f(5)) avec f(x)=x+10 : $resultat1")

    val resultat2 = appliquerDeuxFois(3.0) { x -> x * 2.0 }
    println("f(f(3)) avec f(x)=x*2 : $resultat2")

    val f = { x: Double -> x + 1.0 }
    val g = { x: Double -> x * 2.0 }
    val h = composer(f, g)

    println("h(4) = ${h(4.0)}")
}

fun appliquerDeuxFois(x: Double, f: (Double) -> Double): Double {
    return f(f(x))
}

fun composer(f: (Double) -> Double, g: (Double) -> Double): (Double) -> Double {
    return { x -> g(f(x)) }
}
