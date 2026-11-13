import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val batterieFlow = MutableStateFlow(100)

    val consoleJob = launch {
        batterieFlow.collect { niveau ->
            println(">>> Console : Etat reçu -> $niveau%")

            if (niveau < 20) {
                println("!!! ALERTE CRITIQUE : Energie faible sur Ares-1 !!!")
            }
        }
    }

    delay(100)

    val sondeJob = launch {
        val baisses = listOf(20, 30, 30, 15)

        for (perte in baisses) {
            delay(1000)
            batterieFlow.value -= perte
            println("--- Sonde [Ares-1] : Nouveau niveau -> ${batterieFlow.value}%")
        }
    }

    sondeJob.join()
    delay(100)
    consoleJob.cancel()
    println("--- Transmission terminee ---")
}
