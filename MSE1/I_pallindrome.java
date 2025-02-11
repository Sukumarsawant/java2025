package MSE1.java2025.MSE1;



public class I_pallindrome {
	
	public static boolean pallindrome(int i ) {
		int rev =0 ;
		int rcopy = i;
		while(i>0) {
			rev += rev*10+(i%10);
			
			i/=10;
			
		}
		return rev ==rcopy ;
	}
	public static void main(String s[]) {
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		for(int i =a ; i<=b;++i) {
			if(pallindrome(i)) System.out.print(i+" ");
		}
		
	}
}
