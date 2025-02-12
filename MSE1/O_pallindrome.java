package MSE1.java2025.MSE1;
import java.util.*;
public class O_pallindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		
		int n = sc.nextInt();
		int ncopy = n ; 
		int rev =0;
		while(ncopy>0) {
			rev =(rev*10)+ncopy%10;
			ncopy/=10;
		}
		//System.out.println(n+" "+rev);
		if(n==rev) {
			System.out.println("The number is Pallindrome . ");
		}
		else System.out.println("Number is not a Pallidrom  . ");

		
	}

}
