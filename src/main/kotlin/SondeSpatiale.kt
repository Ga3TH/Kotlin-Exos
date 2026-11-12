data class SondeSpatiale(val nom: String, val orbite: String, val autonomieMois: Int) {
    companion object {
        fun depuisChaine(ligneConfig: String): SondeSpatiale {
            val parties = ligneConfig.split(":")
            val nom = parties[0]
            val orbite = parties[1]
            val autonomieMois = parties[2].toInt()
            return SondeSpatiale(nom, orbite, autonomieMois)
        }
    }
}

fun main() {
    val configuration = "Voyager 1:Heliocentrique:600"
    val sonde = SondeSpatiale.depuisChaine(configuration)

    println("Sonde initialisee avec succes : $sonde")
    println("Nom : ${sonde.nom} , Orbite : ${sonde.orbite} , Autonomie : ${sonde.autonomieMois} mois")
}
