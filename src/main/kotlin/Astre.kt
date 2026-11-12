sealed class Astre(val nom: String, val type: String) {

    class Etoile(
        val couleur: String,
        val temperatureKelvin: Int,
        nom: String
    ) : Astre(nom, "Étoile")

    class Planete(
        val diametreKm: Double,
        val nombreSatellites: Int,
        nom: String
    ) : Astre(nom, "Planète")

    class Comete(
        val periodeAnnees: Double,
        nom: String
    ) : Astre(nom, "Comète")

    class SatelliteNaturel(
        val planeteHote: String,
        nom: String,
    ) : Astre(nom, "Satellite")
}

fun decrire(astre: Astre) {
    when (astre) {
        is Astre.Etoile ->
            println("${astre.nom} -> Type : ${astre.type}, Couleur : ${astre.couleur}, Température : ${astre.temperatureKelvin} K")
        is Astre.Planete ->
            println("${astre.nom} -> Type : ${astre.type}, Diamètre : ${astre.diametreKm} km, Satellites : ${astre.nombreSatellites}")
        is Astre.Comete ->
            println("${astre.nom} -> Type : ${astre.type}, Période orbitale : ${astre.periodeAnnees} ans")
        is Astre.SatelliteNaturel ->
            println("${astre.nom} -> Type : ${astre.type}, Orbite autour de : ${astre.planeteHote}")
    }
}

fun main() {
    val soleil = Astre.Etoile("Jaune", 5778, "Soleil")
    val sirius = Astre.Etoile("Bleu-blanc", 9940, "Sirius")
    val mars = Astre.Planete(6779.0, 2, "Mars")
    val halley = Astre.Comete(75.3, "Halley")
    val titan = Astre.SatelliteNaturel("Saturne", "Titan")

    decrire(soleil)
    decrire(sirius)
    decrire(mars)
    decrire(halley)
    decrire(titan)
}
