package MSE1.java2025.MSE1;
import java.util.*;
public class F_Cosine_series {
	 public static long fact(int i) {
		
		if(i==1) return 1;
		if(i ==0) return 1;
		 return i*(fact(i-1));
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the value in degrees ");
		double x= sc.nextDouble();
		System.out.println("Enter the numebr of terms u want ");
		int n = sc.nextInt();
		x   = x *(Math.PI/180.);
		//cos
		 Double sum =0.0;
		int ct  =0;
		for(int i = 0 ;i<n;i+=2) {
			sum+=Math.pow(-1, ct)*Math.pow(x, i)/(fact(i)*1.);
			ct++;
		}
		System.out.println("Cosine series value is = "+sum);
		
		
	}

}
