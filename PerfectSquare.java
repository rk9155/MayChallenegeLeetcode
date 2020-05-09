package Week2;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		System.out.println(isPerfectSquare(n));

	}

	private static boolean isPerfectSquare(int num) {
		 long left = 1;
	        long right = num;

	        while (left <= right){
	            long mid = left + (right - left)/2;
	            long square = mid * mid;
	            if(square < num){
	                left = mid + 1;
	                }
	            else if(square > num){
	                right = mid - 1;
	                }
	            else{
	                return true;
	                }
	        }
	        return false;
	}

}
