package Week3;

import java.util.HashMap;

public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(permutation(s1,s2));

	}

	private static boolean permutation(String s1, String s2) {
		int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            count[c - 'a']--;
            while (count[c - 'a'] < 0) {
                count[s2.charAt(left++) - 'a']++;
            }
            if (i - left + 1 == s1.length()) return true;
        }
        return false;
	}

}
