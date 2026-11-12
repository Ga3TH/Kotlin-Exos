import java.time.LocalDateTime

interface CorpsCeleste {
    val nom: String
    val magnitude: Double
}

class Planete(
    override val nom: String,
    override val magnitude: Double,
    val distanceSoleil: Double,
    val dateDecouverte: LocalDateTime
) : CorpsCeleste

fun CorpsCeleste.estBrillant(): Boolean {
    return this.magnitude < 1.5
}

fun Planete.toPlaneteJson(): String {
    return """{"nom":"${this.nom}", "magnitude":${this.magnitude}, "distance":${this.distanceSoleil}, "date":"${this.dateDecouverte}"}"""
}

val Planete.estProche: Boolean
    get() = this.distanceSoleil < 150.0

fun main() {
    val terre = Planete(
        nom = "Terre",
        magnitude = -3.99,
        distanceSoleil = 149.6,
        dateDecouverte = LocalDateTime.of(2000, 1, 1, 0, 0)
    )

    val neptune = Planete(
        nom = "Neptune",
        magnitude = 7.78,
        distanceSoleil = 4504.3,
        dateDecouverte = LocalDateTime.of(1846, 9, 23, 0, 0)
    )

    println("TERRE :")
    println("Brillant ? ${terre.estBrillant()}")
    println("JSON : ${terre.toPlaneteJson()}")
    println("Proche du Soleil ? ${terre.estProche}")
    println()

    println("NEPTUNE :")
    println("Brillant ? ${neptune.estBrillant()}")
    println("JSON : ${neptune.toPlaneteJson()}")
    println("Proche du Soleil ? ${neptune.estProche}")
}
