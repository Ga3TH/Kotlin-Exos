import kotlinx.coroutines.*

suspend fun recupererDonneesCamera(): String {
    println("recupererDonneesCamera : Début caméra")
    delay(2000)
    println("recupererDonneesCamera : Fin caméra (après 2s)")
    return "Image Infrarouge"
}

suspend fun recupererDonneesSpectro(): String {
    println("recupererDonneesSpectro : Début spectro")
    delay(2000)
    println("recupererDonneesSpectro : Fin spectro (après 2s)")
    return "Analyse Spectrale"
}

fun main() {
    runBlocking {
        println("main : Début de la mission ---")
        val requeteCamera = async { recupererDonneesCamera() }
        val requeteSpectro = async { recupererDonneesSpectro() }

        println("main : Récupération des données en cours...")

        val resultatCamera = requeteCamera.await()
        val resultatSpectro = requeteSpectro.await()

        println("Résultats : $resultatCamera + $resultatSpectro")
        println("main : Mission terminée")
    }
}
