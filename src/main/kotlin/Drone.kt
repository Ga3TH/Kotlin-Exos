import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

data class EtatDrone( val statut: String){
    val altitude: Int = if (statut == "En vol") {
        50
    } else {
        0
    }
    override fun toString() = "EtatDrone(altitude=$altitude, statut=$statut)"
}

fun main() = runBlocking {
    val etatDrone = MutableStateFlow(EtatDrone("Au sol"))

    val moniteur = launch {
        etatDrone.collect {
            println(">>> Moniteur : Altitude=${it.altitude}m | Statut=${it.statut}")
        }
    }

    val drone = launch {
        delay(1000)
        etatDrone.value = EtatDrone("En vol")
        println("--- Drone : Décollage effectué, ${etatDrone.value} ---")

        delay(1000)
        etatDrone.value = EtatDrone("Livré")
        println("--- Drone : Colis déposé, ${etatDrone.value} ---")
    }

    drone.join()
    delay(100)
    moniteur.cancel()
    println("--- Mission terminée ---")
}