package org.exemple.physique

import kotlin.test.Test
import kotlin.test.assertEquals

class geometerieTest {

    @Test
    fun testPrimetreCercle() {
        val resultat = PerimetreCercle(10.0)
        assertEquals(62.83185, resultat, 0.001)
    }

    @Test
    fun testSurfaceCercle() {
        val resultat = SurfaceCercle(10.0)
        assertEquals(314.159265, resultat, 0.001)
    }

    @Test
    fun testPerimetreRectangle() {
        val resultat = PerimetreRectangle(10.0, 10.0)
        assertEquals( 40.0, resultat, 0.001)
    }
    @Test
    fun testSurfaceRectangle() {
        val resultat = SurfaceRectangle(10.0, 10.0)
        assertEquals(100.0, resultat, 0.001)
    }
}
