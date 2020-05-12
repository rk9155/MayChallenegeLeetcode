package Week2;

public class SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,3,3,4,4,8,8};
		System.out.println(single(a));
	}

	private static int single(int[] a) {
		int ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = ans^a[i];
		}
		return ans;
	}

}
