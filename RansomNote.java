package Week1;

import java.util.HashMap;

//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		System.out.println(canConstruct(s1, s2));
		// System.out.println(canConstruct1(s1,s2));

	}

	private static boolean canConstruct(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		boolean flag = true;
		for (int i = 0; i < s2.length(); i++) {
			if (null != map.get(s2.charAt(i))) {
				int value = map.get(s2.charAt(i));
				map.put(s2.charAt(i), value + 1);

			} else {
				map.put(s2.charAt(i), 1);
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (null == map.get(s1.charAt(i)) || 0 == map.get(s1.charAt(i))) {
				flag = false;
				break;
			} else {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) - 1);
			}
		}

		return flag;
	}

}
