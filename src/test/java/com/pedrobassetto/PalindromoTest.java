package com.pedrobassetto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromoTest {

    @Test
    public void testIsPalindromo(){

        Palindromo p = new Palindromo();

        assertTrue(p.isPalindromo("Rotator"));
        assertTrue(p.isPalindromo("bob"));
        assertTrue(p.isPalindromo("madam"));
        assertTrue(p.isPalindromo("mAlAyAlam"));
        assertTrue(p.isPalindromo("1"));
        assertTrue(p.isPalindromo("Able was I, ere I saw Elba"));
        assertTrue(p.isPalindromo("Madam I’m Adam"));
        assertTrue(p.isPalindromo("Step on no pets."));
        assertTrue(p.isPalindromo("Top spot!"));
        assertTrue(p.isPalindromo("Rotator"));
        assertTrue(p.isPalindromo("02/02/2020"));
    }

    @Test
    public void testIsNotPalindromo(){

        Palindromo p = new Palindromo();

        assertFalse(p.isPalindromo("xyz"));
        assertFalse(p.isPalindromo("elephant"));
        assertFalse(p.isPalindromo("Country"));
        assertFalse(p.isPalindromo("Top . post!"));
        assertFalse(p.isPalindromo("Wonderful-fool"));
        assertFalse(p.isPalindromo("Wild imagination!"));
    }


}
