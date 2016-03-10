package firth;

import java.util.Scanner;
/* Dalton Firth
 * Arithmetic Assignment
 * Created: 2016/03/09
 * Performs a series of calculations on a set of 5 numbers and output the result
 */

public class ArithmeticAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double e=0;

		System.out.println("PLease enter a number");
		Scanner numInput1 = new Scanner(System.in);
		a=Double.parseDouble(numInput1.nextLine());
		System.out.println("PLease enter a number");
		Scanner numInput2 = new Scanner(System.in);
		b=Double.parseDouble(numInput2.nextLine());
		System.out.println("PLease enter a number");
		Scanner numInput3 = new Scanner(System.in);
		c=Double.parseDouble(numInput3.nextLine());
		System.out.println("PLease enter a number");
		Scanner numInput4 = new Scanner(System.in);
		d=Double.parseDouble(numInput4.nextLine());
		System.out.println("PLease enter a number");
		Scanner numInput5 = new Scanner(System.in);
		e=Double.parseDouble(numInput5.nextLine());

		System.out.println(a+b+c+d+e);
		System.out.println(c-b);
		System.out.println(a*e);
		System.out.println(d/b);
		System.out.println((int)d%b);
		System.out.println(Math.pow(a, c));
		System.out.println(Math.sqrt(e));




	}

}
