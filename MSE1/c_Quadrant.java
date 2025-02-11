package MSE1.java2025.MSE1;

public class c_Quadrant {
	public static void main(String s[]) {
		int a = 0 , b=0 ;
		
			a =Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			int q =0;
			if(a*b>0) {
				if(a>0 && b>0) q = 1;
				else q = 3;
			}
			else if(a*b<0) {
				if(a>0 && b<0) q=4;
				else q = 2;
			}
			
		System.out.println("It lies in the " + ((q==0)?" Origin ":" Quadrant "+q));
	}
}
