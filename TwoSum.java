/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 8, 3, 1, 10 };
		int[] reslut = twoSum(nums, 9);
		for (int i = 0; i < reslut.length; i++) {
			System.out.print(reslut[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int remainder;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < target) {
				result[0] = i;
				remainder = target - nums[i];
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == remainder) {
						result[1] = j;
						i = nums.length;
						break;
					}
				}
			}
		}
		return result;
	}
}
