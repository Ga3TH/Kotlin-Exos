package org.exemple.physique

import kotlin.math.PI
import kotlin.math.pow
fun PerimetreCercle(pRayon: Double): Double  = 2 * PI * pRayon
fun SurfaceCercle(pRayon: Double): Double = PI * pRayon.pow(2)
fun PerimetreRectangle(pLongueur: Double, pLargeur: Double): Double = (pLongueur + pLargeur) * 2
fun SurfaceRectangle(pLongueur: Double, pLargeur: Double): Double = pLongueur * pLargeur