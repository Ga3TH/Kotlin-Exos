package org.exemple

fun String?.formaterImmatriculation(): String {
    if (this.isNullOrBlank()){
        return "INCONNU"
    }
    return this.trim().uppercase()
}

fun main() {
    val navire1: String? = "siorabelais-22008a"
    val navire2: String? = null
    val navire3: String? = " "
    val navire4: String? = "  "

    println(navire1.formaterImmatriculation())
    println(navire2.formaterImmatriculation())
    println(navire3.formaterImmatriculation())
    println(navire4.formaterImmatriculation())
}