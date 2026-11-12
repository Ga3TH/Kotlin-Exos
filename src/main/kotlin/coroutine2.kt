import kotlinx.coroutines.*


suspend fun telechargerPochette() {
    println("telechargerPochette: Début du téléchargement de la pochette...")
    delay(2000)
    println("telechargerPochette: Pochette téléchargée !")
}
fun main() {
    runBlocking {
        println("main: Ouverture de l'application")

        val job = launch {
            telechargerPochette()
        }

        println("main: Menu principal (disponible, pendant le téléchargement)")

        job.join()

        println("main: Fin de l'application")
    }
}

