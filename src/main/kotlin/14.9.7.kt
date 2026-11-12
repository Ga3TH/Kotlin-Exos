package org.exemple

data class CorpsCeleste(val nom: String, val distanceUA: Double)

val catalogueSpatial = listOf(
    CorpsCeleste("Mercure", 0.39),
    CorpsCeleste("Venus", 0.72),
    CorpsCeleste("Terre", 1.0),
    CorpsCeleste("Mars", 1.52),
    CorpsCeleste("Jupiter", 5.2),
    CorpsCeleste("Saturne", 9.5),
    CorpsCeleste("Uranus", 19.2),
    CorpsCeleste("Neptune", 30.1),
    CorpsCeleste("Pluton", 39.5),
    CorpsCeleste("Eris", 67.7),
    CorpsCeleste("Sedna", 480.0)
)

const val UA_EN_MILLIONS_KM = 149.6

val resultat = catalogueSpatial
    .filter { it.distanceUA > 30.0 }
    .map {
        val distanceMillionsKm = (it.distanceUA * UA_EN_MILLIONS_KM).toInt()
        "Objet lointain : ${it.nom} à $distanceMillionsKm millions de km."
    }
    .forEach { println(it) }