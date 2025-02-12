package MSE1.java2025.MSE1;

import java.util.*;
public class R_primecheck {
	public static void main(String[] s) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int n = sc.nextInt();
		for(int i=2  ;i<=n/2;++i)
		{
			if(n%i==0) {
				System.out.println("THe number is not a prime number");
				return;
			}
		}
		System.out.println("The number is Prime ");
		
	}

}
