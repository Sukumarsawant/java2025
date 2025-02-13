package MSE1.java2025.MSE1;
import java.util.*;
public class Zc_mat_mul{
static 	int[][] ans ;
	
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first matrix ");
		int m1 = sc.nextInt(), n1 = sc.nextInt();
		System.out.println("Enter the size of 2ndd matrix ");
		int m2 = sc.nextInt(),n2 = sc.nextInt();
		
		
		 int[][] a = new int [m1][n1];
		 int [][] b = new int [m2][n2];
		System.out.println("Enter the elements of the first matrix ");
		for(int i =0 ;i<m1;++i) {
			for(int j=0 ; j<n1;++j) {
				 a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter the elemenet of the second matrix .");
		for(int i =0 ; i<m2;++i) {
			for(int j=0 ; j<n2;++j) {
				b[i][j] = sc.nextInt();
			}
		}
		ans = new int[m1][n2];
		
		for(int i= 0;i<m1;++i) {
			for(int j=0 ; j<n2;++j) {
				for(int k =0  ; k<n1;++k) {
				ans[i][j]+=a[i][k]*b[k][i];
				}
			}
		}
		
		for(int i= 0;i<m1;++i) {
			for(int j=0 ; j<n2;++j) {
				System.out.print(ans[i][j]+" ");
			}
		}
		
		
	}
}
