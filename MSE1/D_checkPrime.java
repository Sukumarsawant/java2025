package MSE1.java2025.MSE1;

public class D_checkPrime {
	public static void main(String s[]) {// since input taken by command line arg not writing println
		int n = Integer.parseInt(s[0]);
		//can handle edge case for 1
		for(int i= 2; i<=n/2;++i) {
			if(n%i==0) {
				System.out.println("Number is not Prime .");
				return ;
			}
		}
		System.out.println("Number is Prime . ");
	}
}
