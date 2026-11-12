abstract class IDocument(
    val titre: String,
    val auteur: String,
    val editeur: String,
    val dateParution: String
) {
    abstract fun afficherDetails(): String
}

class Livre(
    titre: String,
    auteur: String,
    editeur: String,
    dateParution: String,
    val quatriemeDeCouverture: String,
    val nombrePages: Int
) : IDocument(titre, auteur, editeur, dateParution) {

    override fun afficherDetails(): String {
        return "Livre : $titre, écrit par $auteur, publié par $editeur en $dateParution. ($nombrePages pages)"
    }
}

class Photo(
    titre: String,
    auteur: String,
    editeur: String,
    dateParution: String,
    val resolutionHorizontale: Int,
    val resolutionVerticale: Int,
    val estCouleur: Boolean
) : IDocument(titre, auteur, editeur, dateParution) {

    override fun afficherDetails(): String {
        val typeCouleur = if (estCouleur) "couleur" else "noir et blanc"
        return "Photo : $titre par $auteur. Résolution: ${resolutionHorizontale}x${resolutionVerticale}px, $typeCouleur."
    }
}

class Bibliotheque {
    private val catalogue = ArrayList<IDocument>()

    fun ajouterDocument(doc: IDocument) {
        catalogue.add(doc)
    }

    fun afficherTout() {
        println("--- Contenu de la bibliothèque ---")
        for (doc in catalogue) {
            println(doc.afficherDetails())
        }
    }
}

fun main() {
    val maBibliotheque = Bibliotheque()

    maBibliotheque.ajouterDocument(
        Livre("Fondation", "Isaac Asimov", "Editions Opta", "1957", "Résumé...", 255)
    )
    maBibliotheque.ajouterDocument(
        Livre("Fahrenheit 451", "Ray Bradbury", "Denoel", "1955", "Résumé...", 165)
    )
    maBibliotheque.ajouterDocument(
        Photo("Coucher de soleil", "Robert Doisneau", "Inconnu", "Inconnue", 1920, 1080, true)
    )

    maBibliotheque.afficherTout()
}
