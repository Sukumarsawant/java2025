package MSE1.java2025.MSE1;
import java.util.*;
public class P_triangle {
	public static void main(String s[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 3 sides of triangle : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a+b>c && b+c >a && a+c >b) {
		if(a==b && a==c && b==c ) {
			System.out.println("It is an Equilateral triangle .");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("It is an Isoceles triangle .");
		}
		else {
			System.out.println("It is an Scalene triangle .");
		}
	}
	else {
		System.out.println("It is not a valid traingle .");
	}
	}
}
