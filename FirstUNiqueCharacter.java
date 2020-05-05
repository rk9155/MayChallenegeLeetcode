package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUNiqueCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(firstUNique(str));
	}

	private static int firstUNique(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i));
				map.put(str.charAt(i), val+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			int val2 = map.get(str.charAt(i));
			if(val2 == 1) {
				return i;
			}
		}
		return -1;
	}

}
