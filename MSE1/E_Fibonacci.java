package MSE1.java2025.MSE1;

public class E_Fibonacci {
	public static void main(String s[]) {
		int n = Integer.parseInt(s[0]);
	int a = 1 , b=1;
		System.out.print(" 1 1 ");
		int sum = 2;
		for(int i =3;i<=n;++i) {
			
			System.out.print(sum+" ");
			
			a = b ; 
			 b = sum ; 
			 sum= a+b;
			
		}
	}
}
