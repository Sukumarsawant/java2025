package MSE1.java2025.MSE1;

import java.util.*;
public class W_GCD {
	public static void main(String[]s)
	{
		int x , y ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to get GCD : ");
		x = sc.nextInt();
		y = sc.nextInt();
		int xcopy = x , ycopy = y;
		
		while(y!=0) {
			int temp =x ;
			x = y ; 
			y = temp%y;
			if(y==0) {
				System.out.println("GCD of "+xcopy+" and "+ycopy+" is "+x);
				break;
			}
		}
		
	}
}
