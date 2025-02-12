package MSE1.java2025.MSE1;
import java.util.*;
public class S_symmMatrix {
	public static void main(String [] s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of matrix : ");
		int[][]a = new int[n][n];
		for(int i=0 ; i<n;++i) {
			for(int j =0 ; j<n;++j) {
				a[i][j]= sc.nextInt();
			}
		}
		for(int i =0 ;i<n;++i) {
			for(int j =0 ; j<n;++j) {
				if(a[i][j]!=a[j][i]) {
					System.out.println("It is not an Symmetric matrix .");
					return ;
				}
			}
		}
		System.out.println("It is a Symmetric matrix .");
	}

}
