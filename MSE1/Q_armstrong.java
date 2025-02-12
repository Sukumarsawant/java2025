package MSE1.java2025.MSE1;
import java.util.*;
public class Q_armstrong {
	public static void main(String[]s) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a 3 digit no  . ");
	int n = sc.nextInt();
	int arm =0 ;
	int ncopy =n;
	
	while(n>0) {
		arm+=Math.pow(n%10, 3);
		n/=10;
	}
	if(ncopy == arm) {
		System.out.println("The number is armstrong ");
	}
	else System.out.println("The number is not armstrong ");
	}
}
