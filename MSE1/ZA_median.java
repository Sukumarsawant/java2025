
package MSE1.java2025.MSE1;
import java.util.*;
public class ZA_median {
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
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the n elements : ");
		int[] a = new int[n];
		for(int i =0 ; i<n;++i) {
			a[i] = sc.nextInt();
		}
		insertionSort(a);
		if(n%2==0) {
			System.out.println("Median is "+((a[n/2]+a[(n-1)/2])/2.));
		}
		else System.out.println("Median is "+(a[n/2]));
	}
}
