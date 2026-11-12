class compositeur (val nom : String, val anneeNaissance : Int){
    override fun toString(): String {
        return "$nom -> $anneeNaissance "
    }

    var anneeDeces: Int = 0
        set(valeur) {
            if (valeur > anneeNaissance) field = valeur else field = anneeNaissance
        }

    var ageAuDeces: Int = 0
            set(valeur){
                field = anneeDeces - anneeDeces
            }
}

