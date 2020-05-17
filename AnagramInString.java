package Week3;

import java.util.ArrayList;
import java.util.List;

//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

//Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

//The order of output does not matter.

//Example 1:

//Input:
//s: "cbaebabacd" p: "abc"

//Output:
//[0, 6]

//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".

public class AnagramInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd";
		String p = "abc";
	   System.out.println(findAnagrams(s,p));

	}

	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList();
        
        if(s.length()==0 || s == null) return res;
        
        int[] count_Char = new int[26];
        for(char c : p.toCharArray()){
            count_Char[c-'a']++;
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        
        while(right<s.length()){
            
            if(count_Char[s.charAt(right++)-'a']-- >= 1) count--;
            
            if(count == 0) res.add(left);
            
            if(right-left == p.length() && count_Char[s.charAt(left++)-'a']++ >= 0) count++;
        }
        return res;
        
    }
}
