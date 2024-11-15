import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTestTest {

    @Test
    public void testPrime(){
        assertTrue(PrimeTest.isPrime(3));
        assertTrue(PrimeTest.isPrime(5));
        assertTrue(PrimeTest.isPrime(7));

        assertFalse(PrimeTest.isPrime(4));
        assertFalse(PrimeTest.isPrime(9));
        assertFalse(PrimeTest.isPrime(16));

    }

    @Test
    public void testPalindrome(){
        assertTrue(PrimeTest.isPalindrome("aibohphobia"));
        assertTrue(PrimeTest.isPalindrome("level"));

        assertFalse(PrimeTest.isPalindrome("That"));

    }



}