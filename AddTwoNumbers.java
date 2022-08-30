/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 9, 9, 9, 9, 9, 9, 9 };
		int[] num2 = { 9, 9, 9, 9 };
		int[] result = addTwoNumbers(num1, num2);
		System.out.println("Input1: ");
		printArray(num1);
		System.out.println("Input2: ");
		printArray(num2);
		System.out.println("Output: ");
		printArray(result);
	}

	public static int[] addTwoNumbers(int[] num1, int[] num2) {
		int reverseNum1, reverseNum2;
		int sum;
		String strSum;
		int[] result;
		reverseNum1 = reverseAarryToNumber(num1);
		reverseNum2 = reverseAarryToNumber(num2);
		sum = reverseNum1 + reverseNum2;
		// System.out.println("reverseNum1: " + reverseNum1);
		// System.out.println("reverseNum2: " + reverseNum2);
		// System.out.println("sum: " + sum);
		strSum = Integer.toString(sum);
		result = new int[strSum.length()];
		int[] aIntArray = convertStrToIntArray(strSum);
		result = reverseArray(aIntArray);
		return result;
	}

	public static int reverseAarryToNumber(int[] array) {
		int numberAfterReverse = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			double highDigitDouble = Math.pow(10, i);
			int highDigit = (int) highDigitDouble;
			// System.out.println("highDigitDouble: " + highDigitDouble);
			// System.out.println("highDigit: " + highDigit);
			numberAfterReverse = numberAfterReverse + (array[i] * highDigit);
		}
		return numberAfterReverse;
	}

	public static int[] convertStrToIntArray(String string1) {
		int[] IntegerArray = new int[string1.length()];
		for (int i = 0; i < string1.length(); i++) {
			// System.out.println(string1.charAt(i));
			String tempI = Character.toString(string1.charAt(i));
			// System.out.println(tempI);
			int integerI = Integer.parseInt(tempI);
			// System.out.println(integerI);
			IntegerArray[i] = integerI;
		}
		return IntegerArray;
	}

	public static int[] reverseArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			result[array.length - 1 - i] = array[i];
			// System.out.println(result[array.length - 1 - i]);
		}
		return result;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
	}

}
