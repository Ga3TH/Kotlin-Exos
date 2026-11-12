package test

sealed class TypeEtoile(val nom: String, val couleur: String) {

    object O : TypeEtoile("Supergeante Bleue", "Bleu") {
        fun decrireTemperature() {
            println("Temperature extreme : > 30 000 °C")
        }
    }

    object G : TypeEtoile("Naine Jaune", "Jaune") {
        fun decrireTemperature() {
            println("Temperature moderee : ~ 5 500 °C")
        }
    }

    object M : TypeEtoile("Naine Rouge", "Rouge") {
        fun decrireTemperature() {
            println("Temperature basse : < 3 700 °C")
        }
    }
}

fun main() {
    val etoileObservee: TypeEtoile = TypeEtoile.G

    println("Classification : ${etoileObservee.nom}")
    println("Couleur dominante : ${etoileObservee.couleur}")
    print("Caracteristique thermique : ")

    when (etoileObservee) {
        is TypeEtoile.O -> etoileObservee.decrireTemperature()
        is TypeEtoile.G -> etoileObservee.decrireTemperature()
        is TypeEtoile.M -> etoileObservee.decrireTemperature()
    }
}
