package Week1;

import java.util.Scanner;

class numberComplements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(findComplement(n));
	}
    public static int findComplement(int n) {
         
        int Nbits =  (int)(Math.floor(Math.log(n) / Math.log(2))) + 1; 
  
        return ((1 << Nbits) - 1) ^ n; 
    
    }
}