package MSE1.java2025.MSE1;

import java.util.Scanner;

public class Y_kth_fibonacci {
	static int fibo(int k) {
		if(k==2 || k==1) return 1;
		else return fibo(k-1)+fibo(k-2);
	}
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kth term to be found : ");
		int n= sc.nextInt();
		System.out.println("The kth term is : "+fibo(n));
		
	}
}
