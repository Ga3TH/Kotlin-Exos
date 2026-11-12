import kotlinx.coroutines.*

suspend fun simulerAppelAPI(): String {
    delay(3000)
    return "37°C, canicule !"
}

fun main() {
    runBlocking {
        println("--- Application Météo ---")
        println("Action : L'utilisateur clique sur le bouton 'Actualiser'")

        val job = launch {
            println("Chargement des données météo en cours ...")
            val resultat = simulerAppelAPI()
            println("Mise à jour de l'écran avec : $resultat")
        }

        println("L'interface reste réactive : l'utilisateur peut toujours cliquer ailleurs.")

        job.join()

        println("--- Fin de l'application ---")
    }
}
