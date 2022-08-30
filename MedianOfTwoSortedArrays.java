
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 0, 8, 9, 11 };
		double result = findMedianSortedArrays(nums1, nums2);
		String words = "The median is: ";
		System.out.printf("%s %.5f %n", words, result);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int sum = 0;
		double reslut = 0;
		int[] tempArray = mergedTwoArray(nums1, nums2);
		int[] newArray = sortArray(tempArray);
		if (newArray.length % 2 != 0) {
			reslut = (double) newArray[newArray.length / 2];
		} else {
			sum = newArray[(newArray.length / 2) - 1] + newArray[newArray.length / 2];
			reslut = (double) sum / 2;
		}
		// System.out.println("Sum: " + sum);
		// System.out.println("Reslut: " + reslut);
		return reslut;
	}

	public static int[] mergedTwoArray(int[] array1, int[] array2) {
		int[] newArray = Arrays.copyOf(array1, array1.length + array2.length);
		for (int i = 0; i < array2.length; i++) {
			int j = array1.length + i;
			newArray[j] = array2[i];
		}
		return newArray;
	}

	public static int[] sortArray(int[] array) {
		int maxNum;
		for (int i = 0; i <= array.length - 1; i++) {
			for (int x = 0; x < i; x++) {
				if (array[i] < array[x]) {
					maxNum = array[x];
					array[x] = array[i];
					array[i] = maxNum;
				}
			}
		}
		System.out.println("New array is: " + Arrays.toString(array));

		return array;
	}
}
