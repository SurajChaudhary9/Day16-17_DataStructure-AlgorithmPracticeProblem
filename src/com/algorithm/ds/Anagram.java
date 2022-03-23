/**
 *@PROBLEM_STATEMENT : To find two strings are anagram or not
    a. Desc -> One string is an anagram of another if the second is simply a
       rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
    b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
    c. Logic -> Take two strings convert them to char array ,sort them compare character
    by character if any character mismatches return false
    d. O/P -> return true if anagram else return false
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.algorithm.ds;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String string1 = scanner.next();
		System.out.println("Enter the String 2");
		String string2 = scanner.next();
		Anagram anagramDetection = new Anagram();
		if (anagramDetection.anagram(string1, string2)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
		scanner.close();
	}

	/*
	 * @purpose: Ability to check two strings are of same characters
	 * 
	 * @param: Two different strings of same length
	 * 
	 * @function : converts string to char array sort them and compare character by
	 * character if equal return true
	 * 
	 * @return: Returns true on success and false on failure
	 */
	private boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length())
			return false;
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

}
