package MSE1.java2025.MSE1;

import java.util.*;
public class K_descend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of integeres : ");
		int n= sc.nextInt();
		System.out.println("Enter the no. : ");
		int[] a= new int[n];
		for(int i =0 ; i<n;++i) {
			a[i] = sc.nextInt();
		}
		for(int i =0 ; i<n;++i) {
			for(int j = i ; j<n;++j) {
				if(a[i]<a[j]) {
					int temp = a[i]; 
					a[i] = a[j];
					a[j] = temp ;
				}
			}
		}
		System.out.println("The descended array is   : ");
		for(int i =0; i<n;++i) {
			System.out.print(" "+ a[i]);
		}
		

	}

}
