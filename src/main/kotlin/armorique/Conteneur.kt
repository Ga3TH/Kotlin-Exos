package class_generique

class Conteneur<T>(val contenu : T,val poidsInit : Double) {
    var poids : Double = poidsInit
        private set(valeur){
            field = valeur
        }

    fun ajouterPoids(poidsAjouter : Double){
        poids += poidsAjouter
    }

    override fun toString(): String {
        return "contenu : ${contenu} \npoids : ${poids}"
    }
}