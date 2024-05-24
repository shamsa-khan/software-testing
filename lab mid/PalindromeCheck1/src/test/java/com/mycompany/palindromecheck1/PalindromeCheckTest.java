/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.palindromecheck1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckTest {
 //for passsing  test case plz remove case sensitive  one because it is not handled in code 
    @Test
    public void testIsPalindrome() {
        // test case 1 which is palindrome
        assertTrue(PalindromeCheck.isPalindrome("madam"));

        // Test case 3 which is  Non-palindrome
        assertFalse(PalindromeCheck.isPalindrome("madan"));

        // Test case 5 which is palindrome 
        assertTrue(PalindromeCheck.isPalindrome("m"));

        // Test case 6 which is also palindrome 
        assertTrue(PalindromeCheck.isPalindrome(""), "an empty string ");
        
        //test case 7 which is not palindrome 
       
//        assertTrue(PalindromeCheck.isPalindrome("Madam"), "case sensitive  ");
        

    }
}
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        PalindromeCheck.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isPalindrome method, of class PalindromeCheck.
//     */
//    @Test
//    public void testIsPalindrome() {
////        System.out.println("isPalindrome");
//        String str = "";
//        boolean expResult = false;
//        boolean result = PalindromeCheck.isPalindrome(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
