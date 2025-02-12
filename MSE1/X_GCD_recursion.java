package MSE1.java2025.MSE1;
import java.util.*;
public class X_GCD_recursion {
	static int __gcd(int x,int y) {
	if(y==0) return x;
	else return __gcd(y,x%y);
	}
	
	public static void main(String[] s) {
		System.out.println("Enter the two number to get gcd :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The GCD is : "+__gcd(x,y));
		
	}

}
