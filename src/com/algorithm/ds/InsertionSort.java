/**
 *@PROBLEM_STATEMENT : Insertion Sort
 * a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
    b. I/P -> read in the list words
    c. Logic -> Use Insertion Sort to sort the words in the String array
    d. O/P -> Print the Sorted List
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.algorithm.ds;

import java.util.Scanner;

public class InsertionSort {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @purpose: Ability to insertion sort
	 * @param: Takes String array as input
	 * @function : sorts the given array in ascending order and stores them in their
	 *           indecencies
	 * @return: No return value.
	 */
	static public void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String key = array[i];
			int j = i - 1;
			// Compare key with each element on the left of it until an element smaller than
			// it is found.
			// For descending order, change key<array[j] to key>array[j].
			while (j >= 0 && (key.compareTo(array[j]) < 0)) {
				array[j + 1] = array[j];
				--j;
			}
			// Place key at after the element just smaller than it.
			array[j + 1] = key;
		}
	}

	/**
	 * @purpose: Ability to print String array
	 * @param: Takes String array as input
	 * @function : print the given string array
	 * @return: No return value.
	 */
	static public void printString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println("string at index " + i + " is " + strings[i]);
		}
	}

	/**
	 * @purpose: Ability to scan String array
	 * @param: Takes String array as input
	 * @function : scans the data from user and stores in to string array
	 * @return: No return value.
	 */
	static public void scanString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("Enter the string at index :%d\n", i);
			strings[i] = scanner.nextLine();
		}
	}

	public static void main(String[] args) {
		String[] strings = new String[5];
		scanString(strings);
		System.out.println("***********************Before Sort*************************");
		printString(strings);
		insertionSort(strings);
		System.out.println("***********************After Sort*************************");
		printString(strings);

	}
}
