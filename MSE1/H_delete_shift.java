package MSE1.java2025.MSE1;
import java.util.*;
public class H_delete_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array a: ");
		int n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter the elements : ");
		for(int i =0  ;i<n;++i) {
			 a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index to be deleted (0-based)");
		int del  = sc.nextInt();
		for(int i = del ; i<n-1;++i) {
			a[i] = a[i+1];
		}
		System.out.println("The shifted array is : ");
		for(int i =0 ;i<n-1;++i) {
		System.out.print(" "+a[i]);
		}
	}

}
