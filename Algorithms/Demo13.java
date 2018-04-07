package Algorithms;

import java.util.Scanner;
import java.lang.Math;
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a, x:");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double x =s.nextDouble();
		double y=a*a*a*a*a+Math.asin(a*x)+Math.log(a+x)+Math.exp(a*x);
		System.out.println(y);
	}

}
