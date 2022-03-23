/**
 *@PROBLEM_STATEMENT : Bubble Sort List
 *a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.algorithm.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSortList {
	static List<Integer> integerList = new ArrayList<>();
	static Random random = new Random();

	public static void main(String[] args) {
		scanArrayList();
		System.out.println("***********************Before Sort*************************");
		printArrayList();
		bubbleSortArrayList();
		System.out.println("***********************After Sort*************************");
		printArrayList();
	}

	/**
	 * @purpose: Ability to BubbleSort sort
	 * @param: No parameters
	 * @function : sorts the given list in ascending order and stores them in their
	 *           indecencies
	 * @return: No return value.
	 */
	private static void bubbleSortArrayList() {
		for (int i = 1; i < integerList.size(); i++) {
			int size = integerList.size();

			// loop to access each array element
			for (int j = 0; j < size - 1; j++)

				// loop to compare array elements
				for (int k = 0; k < size - j - 1; k++)

					// compare two adjacent elements
					// change > to < to sort in descending order
					if (integerList.get(k).compareTo(integerList.get(k + 1)) > 0) {

						// swapping occurs if elements
						// are not in the intended order
						Integer temp = integerList.get(k);
						integerList.set(k, integerList.get(k + 1));
						integerList.set(k + 1, temp);
					}
		}
	}

	/**
	 * @purpose: Ability to print array list
	 * @param: No parameters
	 * @function : prints the array list pre defined to string
	 * @return: No return value.
	 */
	private static void printArrayList() {
		System.out.println(integerList);
	}

	/**
	 * @purpose: Ability to scan array list
	 * @param: No parameters
	 * @function : scan the array list from random numbers
	 * @return: No return value.
	 */
	private static void scanArrayList() {
		for (int i = 0; i < 10; i++) {
			integerList.add(random.nextInt(999) + 1);
		}
	}
}
