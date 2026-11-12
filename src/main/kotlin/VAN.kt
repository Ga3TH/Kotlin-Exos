import kotlin.math.pow
import kotlin.math.round
fun calculerVAN(
    fluxFutur: Double,
    taux: Double,
    annees: Int,
    moduler: (Double) -> Double
): Double {
    val vanBrute = fluxFutur / (1 + taux).pow(annees)
    return moduler(vanBrute)
}

fun main() {
    val fluxFutur = 1000.0
    val taux = 0.07
    val annees = 10
    val vanSansTransfo = calculerVAN(fluxFutur, taux, annees) { it }
    println("VAN brute, sans transformation : $vanSansTransfo")
    val vanSecurite = calculerVAN(fluxFutur, taux, annees) { it * 0.95 }
    println("VAN avec marge de sécurité de 5% : $vanSecurite")
    val vanArrondie = calculerVAN(fluxFutur, taux, annees) { round(it) }
    println("VAN brute arrondie à l'entier le plus proche : $vanArrondie")
    val vanDollars = calculerVAN(fluxFutur, taux, annees) { it * 1.08 * 0.98 }
    println("VAN brute, estimée en Dollars (1EUR=1.08 USD), avec risque de change de 2% : $vanDollars $")
}
