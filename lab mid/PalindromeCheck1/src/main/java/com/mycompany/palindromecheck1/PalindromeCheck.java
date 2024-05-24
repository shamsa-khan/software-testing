/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromecheck1;

/**
 *
 * @author 3com
 */
public class PalindromeCheck {
 public static void main(String[] args) {
 String str = "madam";
 boolean isPalindrome = isPalindrome(str);
 System.out.println("Is the string a palindrome? " + 
isPalindrome);
 }
 public static boolean isPalindrome(String str) {
 int left = 0, right = str.length() - 1;
 while (left < right) {
 if (str.charAt(left) != str.charAt(right)) {
 return false;
 }
 left++;
 right--;
 }
 return true;
 }
}