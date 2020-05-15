package Week3;

public class MaxSumCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,-3,5};
		System.out.println(maxSum(a));

	}

	private static int maxSum(int[] A) {
	        int total = 0, maxSum = Integer.MIN_VALUE, curMax = 0, minSum = Integer.MAX_VALUE, curMin = 0;
	        for (int i: A) {
	            curMax = Integer.max(curMax + i,i);
	            maxSum = Integer.max(maxSum, curMax);
	            curMin = Integer.min(curMin + i, i);
	            minSum = Integer.min(minSum, curMin);
	            total += i;
	        }
	        return maxSum > 0 ? Integer.max(maxSum, total - minSum) : maxSum;
	    }
	}

