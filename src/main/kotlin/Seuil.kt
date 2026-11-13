class ReglagesAppareil {
    var volume: Int = 0
        set(value) {
            if (value > 100) {
                println("[INFO] Limite atteinte sur 'volume' : $value plafonne a 100.")
                field = 100
            } else {
                field = value
            }
        }

    var luminosite: Int = 0
        set(value) {
            if (value > 50) {
                println("[INFO] Limite atteinte sur 'luminosite' : $value plafonne a 50.")
                field = 50
            } else {
                field = value
            }
        }
}

fun main() {
    val reglages = ReglagesAppareil()
    reglages.volume = 120
    reglages.luminosite = 60

    println("Volume : ${reglages.volume}, Luminosite : ${reglages.luminosite}")
}
