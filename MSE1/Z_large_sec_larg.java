package MSE1.java2025.MSE1;
import java.util.*;
public class Z_large_sec_larg {
	static void insertionSort(int a[]) {
		int n = a.length;
		for(int i= 1;i<n;++i) {
			int j = i-1;
			int val = a[i];
			while(j>=0 && a[j]<val)
			{
				a[j+1]= a[j];
				j--;
			}
			a[j+1] =val;
		}
	}
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		System.out.println("Enter the element of the array : ");
		for(int i =0 ;i<n;++i) {
			 arr[i] = sc.nextInt();
			
		}
		insertionSort(arr);
		
//		for(int i =0 ;i<n;++i) {
//			System.out.println(arr[i]+" ");		}
		System.out.println("Largest is "+arr[0]+" and second largest is "+arr[1]);
		
	}
}
