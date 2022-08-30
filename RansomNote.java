/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = canConstruct("ab", "abc");
		System.out.println(result);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		boolean result = false;
		if (magazine.contains(ransomNote)) {
			result = true;
		}
		return result;
	}
}
