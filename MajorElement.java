package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class MajorElement {

public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(majorityElement(a));
	}
private static int majorityElement(int[] a) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = a.length;
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				int val = map.get(a[i]);
				map.put(a[i], val+1);
			}else {
				map.put(a[i],1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			int x = map.get(a[i]);
			if(x > (n/2)) {
				ans = a[i];
			}
		}
		return ans;
	}

}
