class Conteneur(val longueurMetres: Double, val largeurMetres: Double, val hauteurMetres: Double)

val Conteneur.volume: Double
    get() = longueurMetres * largeurMetres * hauteurMetres

fun main() {
    val conteneur = Conteneur(10.0, 2.0, 2.0)
    println("Volume du conteneur (pour L=${conteneur.longueurMetres}, l=${conteneur.largeurMetres} et h= ${conteneur.hauteurMetres}) : ${conteneur.volume} m3")
}
