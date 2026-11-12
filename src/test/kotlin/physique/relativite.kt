package org.exemple.physique

import kotlin.test.Test
import kotlin.test.assertEquals

class RelativiteTest {

    @Test
    fun testDureeSurTerre() {
        val resultat = dureeSurTerre(60.0, 299000.0)
        assertEquals(825.7444, resultat, 0.001)
    }

    @Test
    fun testlongueurSurTerre() {
        val resultat = longueurSurTerre(100.0, 299000.0)
        assertEquals(7.2661, resultat, 0.001)
    }

    @Test
    fun testvitesseRepereTerre() {
        val resultat = vitesseRepereTerre(150000.0, 150000.0)
        assertEquals(239933.5359, resultat, 0.001)
    }
}
