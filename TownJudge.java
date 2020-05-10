package Week2;
import java.util.HashMap;
import java.util.HashSet;
public class TownJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		System.out.println(findJudge(trust,n));
	}

	private static int findJudge(int[][] trust, int n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		HashSet<Integer> m = new HashSet<>();
		int ans = -1;
//		ans = trust.length;
		if(n==1) {
			ans = 1;
		}
		
		for (int i = 0; i < trust.length; i++) {
			m.add(trust[i][0]);
		}
		for (int i = 0; i < trust.length; i++) {
			if(map.containsKey(trust[i][1])) {
				int val = map.get(trust[i][1]);
				map.put(trust[i][1], val+1);
			}else {
				map.put(trust[i][1], 1);
			}
		}
		for(int i =1 ;i<=n;i++) {
			if(map.containsKey(i)) {
			int x = map.get(i);
			if(m.contains(i)==false && x == n-1) {
				ans = i;
				break;
			}
			}
		}
		
		return ans;
	}

}
