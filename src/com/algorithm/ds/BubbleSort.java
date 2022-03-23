/**
 *@PROBLEM_STATEMENT : Bubble Sort
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.algorithm.ds;

import java.util.Scanner;

public class BubbleSort {
	static Scanner scanner = new Scanner(System.in);

	/*
	 * @purpose: Ability to BubbleSort sort
	 * 
	 * @param: Takes integer array as input
	 * 
	 * @function : sorts the given array in ascending order and stores them in their
	 * indecencies
	 * 
	 * @return: No return value.
	 */
	static public void bubbleSort(Integer[] array) {
		for (int i = 1; i < array.length; i++) {
			int size = array.length;

			// loop to access each array element
			for (int j = 0; j < size - 1; j++)

				// loop to compare array elements
				for (int k = 0; k < size - j - 1; k++)

					// compare two adjacent elements
					// change > to < to sort in descending order
					if (array[k].compareTo(array[k + 1]) > 0) {

						// swapping occurs if elements
						// are not in the intended order
						Integer temp = array[k];
						array[k] = array[k + 1];
						array[k + 1] = temp;
					}
		}
	}

	/*
	 * @purpose: Ability to print integer array
	 * 
	 * @param: Takes integer array as input
	 * 
	 * @function : print the given integer array
	 * 
	 * @return: No return value.
	 */
	static public void printArray(Integer[] integers) {
		for (int i = 0; i < integers.length; i++) {
			System.out.println("Integer at index " + i + " is " + integers[i]);
		}
	}

	/*
	 * @purpose: Ability to scan integer array
	 * 
	 * @param: Takes integer array as input
	 * 
	 * @function : scans the data from user and stores in to integer array
	 * 
	 * @return: No return value.
	 */
	static public void scanArray(Integer[] integers) {
		for (int i = 0; i < integers.length; i++) {
			System.out.printf("Enter the integer at index :%d\n", i);
			integers[i] = scanner.nextInt();
		}
	}

	public static void main(String[] args) {
		Integer[] integers = new Integer[5];
		scanArray(integers);
		System.out.println("***********************Before Sort*************************");
		printArray(integers);
		bubbleSort(integers);
		System.out.println("***********************After Sort*************************");
		printArray(integers);

	}

}
