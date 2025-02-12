package MSE1.java2025.MSE1;

import java.util.*;
public class V_recrusionfact {
	static long fact(int n) {
		if(n==0 ||n==1) {
			return 1;
			
		}
		else return n*fact(n-1);
	}
	public static void main(String[]a) {
		System.out.println("Enter the no to get factorial : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The factorial is : "+fact(n));
	}

}
