package MSE1.java2025.MSE1;

import java.util.Scanner;

public class ZB_nCr {
	static long fact(int n ) {
		if(n==0 || n==1) return 1 ;
		else return n*fact(n-1);
	}
	static double nCr (int n , int r) {
		return (fact(n)*1./(fact(r)*fact(n-r)));
	}
	public static void main(String[]s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n and r resp.");
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println("The value of nCr is = "+nCr(n,r));
		
	}
	
}
