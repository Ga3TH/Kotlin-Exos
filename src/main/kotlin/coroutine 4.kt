import kotlinx.coroutines.*

fun main() = runBlocking {
    println("--- Centre de contrôle : Début de la séquence ---")

    val scopeLancement = CoroutineScope(Dispatchers.Default)

    val job = scopeLancement.launch {
        for (i in 1..5) {
            if (!isActive) break
            println("Étape $i : Vérification des systèmes...")
            try {
                delay(1000)
            } catch (e: CancellationException) {
                break
            }
        }
    }

    delay(2500)
    job.cancelAndJoin()

    println(">>> Capteur : Anomalie détectée ! Annulation du lancement !")
    println("--- Fin de mission ---")
}
