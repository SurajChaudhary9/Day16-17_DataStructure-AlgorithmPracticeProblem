/**
 *@PROBLEM_STATEMENT : Write a program to do Merge Sort of list of Strings.
a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
independently, and then merge the results to sort the full array. To sort a[lo, hi),
we use the following recursive strategy:
b. Base case: If the subarray length is 0 or 1, it is already sorted.
c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
result.
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.algorithm.ds;

public class MergeSort {
	/**
	 * @Purpose: Sorting Of Elements Using Merge Sort
	 * @Param: Elements Of Arrays
	 */
	public static void main(String[] args) {
		String[] array = { "Delhi", "Mumbai", "Pune", "Tripura", "Agartalla", "Kolkata", "Assam" };

		String[] sortedArray = mergeSort(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}
	}

	/**
	 * @Purpose: Sorting Of Elements Using Merge Sort
	 * @Param: Elements Of String Array Named List
	 * @Return : Sorted Array
	 */
	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	/**
	 * @Purpose: Sorting Of Elements Using Merge Sort
	 * @Param: Elements Of String Array in left or Right
	 * @Return : Merged Array
	 */

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}

}
