package Week2;

import java.util.Stack;

public class RemoveKdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "112";
		int k = 1;
		String ans = removeKdigits(n,k);
		System.out.println(ans);

	}

	private static String removeKdigits(String nums, int k) {
		// TODO Auto-generated method stub
	        int size  = nums.length();
	        if(k==size) return "0";
	        
	        Stack<Character> stack = new Stack();
	        int counter = 0;
	        while(counter<size){
	            //greedy algo
	            while(k>0 && !stack.isEmpty() && stack.peek()>nums.charAt(counter)){
	            stack.pop();
	                k--;
	            }
	            stack.push(nums.charAt(counter));
	                counter++;
	        }
	        
	        while(k>0){
	            stack.pop();
	            k--;

	        }
	        StringBuilder sb = new StringBuilder();
	        while(!stack.isEmpty()){
	         char ch = stack.pop();
	            sb.append(ch);
	        }
	        sb.reverse();
	        while(sb.length()>1 && sb.charAt(0)=='0'){
	         sb.deleteCharAt(0);
	        }
	        return sb.toString(); 
	}

//	private static String removeKdigits(String n, int k) {
//		// TODO Auto-generated method stub
//		String ans = removeKDigits(n,k);
//		if(ans.charAt(0)=='0') {
//			return ans.substring(1);
//		}
//		return ans;
//	}
//
//	private static String removeKDigits(String n, int k) {
//		
//		String ans = "";
//		int l = n.length();
//		if(l<=k) {
//			return "0";
//		}
//		if(l==0) {
//			return "0";
//		}
//		if(k==0) {
//			return n;
//		}
//		String ans1 = removeKDigits(n.substring(1),k-1);
//		String ans2 = n.charAt(0)+removeKDigits(n.substring(1),k);
//		int res1 = Integer.parseInt(ans1);
//		int res2 = Integer.parseInt(ans2);
//		if(res1<res2) {
//			ans = ans1;
//		}else {
//			ans = ans2;
//		}
//		return ans;
	

}
