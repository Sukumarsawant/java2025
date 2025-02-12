package MSE1.java2025.MSE1;
//import java.util.*;
public class M_Dis_cml {
	public static void main(String s[]) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates x1 and y1 resp. and x2 y2 resp ");
		int x1 =Integer.parseInt(s[0]);
		int y1 =Integer.parseInt(s[1]);
		int x2 = Integer.parseInt(s[2]);
		int y2 = Integer.parseInt(s[3]);
		Double d = Math.sqrt(Math.pow(x2-x1,2)-Math.pow(y2-y1, 2));
		System.out.println("THe Euclidian distance is : " + d );
		
	}
}
