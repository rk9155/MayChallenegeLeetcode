package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tree";
		System.out.println(frequencySort(s));

	}
	    public static String frequencySort(String str) {
	        Map<Character, Integer> alph = new HashMap<>();
	        for (char letter : str.toCharArray()) {
	            alph.put(letter, alph.getOrDefault(letter, 0) + 1);
	        }
	        
	        List<Map.Entry<Character, Integer>> list = new ArrayList<>(alph.entrySet()); 
	        list.sort((e1, e2) -> e2.getValue() - e1.getValue());
	        StringBuilder ans = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : list) {
	            for (int i = 0; i < entry.getValue(); i++) {
	                ans.append(entry.getKey());
	            }
	        }
	        return ans.toString();
	    }
	}

