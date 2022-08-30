/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		int x = -34563545;
		System.out.println(isPalindrome(x));

	}

	public static boolean isPalindrome(int x) {
		boolean result = false;
		int reverseNum = 0;
		int orgineX = x;
		while (x != 0) {
			int digit = x % 10;
			reverseNum = reverseNum * 10 + digit;
			x = x / 10;
		}
		// System.out.println(orgineX + "," + reverseNum);
		if (orgineX == reverseNum) {
			result = true;
		}
		return result;
	}

}
