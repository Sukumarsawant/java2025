package MSE1.java2025.MSE1;
	

import java.util.*;


//10000 5 3 test case : ans :
//Simple interest is : 1500.0
//Compound Interest is : 1576.25

public class simple_interest {
	public static double simpleInterest(double p , double r , double t ) {
		return (p*r*t)/100.;
	}
	public static double compoundInterest(double p , double r , double t) {
		return ((p*Math.pow(1+r/100,t))-p);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double p , r ,t ; 
		System.out.println("Enter the values of printcipal , ROI and time  period : ");
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextDouble();
		double s = simpleInterest(p,r,t);
		double c= compoundInterest(p,r,t);
		System.out.println("Simple interest is : "+s);
		System.out.println("Compound Interest is : "+String.format("%.2f",c));
		
		
	}

}
