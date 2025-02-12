package MSE1.java2025.MSE1;
import java.util.*;
public class L_Distance {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates x1 and y1 resp. and x2 y2 resp ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Double d = Math.sqrt(Math.pow(x2-x1,2)-Math.pow(y2-y1, 2));
		System.out.println("THe Euclidian distance is : " + d );
		
	}
}
