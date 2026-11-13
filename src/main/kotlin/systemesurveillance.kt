import kotlin.properties.Delegates

class CapteurMoteur {
    var temperature: Double = 0.0
        set(value) {
            field = value
            if (value in -20.0..150.0) {
                println("[CAPTEUR] Nouvelle température : $value°C")
            } else {
                println("[ALERTE] Température invalide : $value°C (Plage: -20 à 150)")
            }
        }
}

fun main() {
    val capteur = CapteurMoteur()
    capteur.temperature = 50.0
    capteur.temperature = 200.0
}
