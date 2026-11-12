object CentreControleMaritime {
    private var nbAlertes: Int = 0

    fun emettreAlerte(message: String) {
        nbAlertes++
        println("[ALERTE N°$nbAlertes] ${message.uppercase()}")
    }

    fun afficherBilan() {
        println("Bilan : Le centre a diffusé un total de $nbAlertes alerte(s)")
    }
}

fun main() {
    CentreControleMaritime.emettreAlerte("Tempête de force 9 sur la zone Iroise")
    CentreControleMaritime.emettreAlerte("Brouillard dense dans l'estuaire")
    CentreControleMaritime.afficherBilan()
}