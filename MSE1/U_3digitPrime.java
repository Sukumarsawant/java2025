package MSE1.java2025.MSE1;

public class U_3digitPrime {

	 static final int N = 100000;
	static int[] a= new int[N];
//	J_prime() {
	
	
	public static int[] sieve() {
		for(int i =0 ;i<N;++i){
			a[i] =1;
		}
		a[0] =0 ;a[1]=0 ; a[2]= 1;
		for(int i = 2 ; i<N;++i) {
			for(int j = i+i;j<N;j+=i) {
				a[j]=0;
			}
		}
		return a ;
		
	}
	public static void main(String[]s) {
		a = sieve();
		
		for(int i = 999;i>=100;--i) {
			if(a[i]==1) {
				System.out.print(i+"\t");			}
		}
	}

}
