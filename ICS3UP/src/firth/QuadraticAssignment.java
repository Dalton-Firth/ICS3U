package firth;

import java.util.Scanner;
import java.text.DecimalFormat;
/* Dalton Firth
 * Arithmetic Assignment
 * Created: 2016/03/09
 * Performs a series of calculations on a set of 5 numbers and output the result
 */

public class QuadraticAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat ("0.0");

		double a = 0;
		double b = 0;
		double c = 0;
		double answer1 = 0;
		double answer2 = 0;

		System.out.println("Please enter a number");
		Scanner numInput1 = new Scanner(System.in);
		a = Double.parseDouble(numInput1.nextLine());
		System.out.println("Please enter a number");
		Scanner numInput2 = new Scanner(System.in);
		b = Double.parseDouble(numInput2.nextLine());
		System.out.println("Please enter a number");
		Scanner numInput3 = new Scanner(System.in);
		c = Double.parseDouble(numInput3.nextLine());

		

		if((b * b) - (4 * a * c)>=0){
			answer1 = ((b) + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
			answer2 = ((b) - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
			System.out.println("x= " + df.format(answer1) + " x= " + df.format(answer2));
		}
		else{
			System.out.println("No real roots");
		}
		


	}

}
