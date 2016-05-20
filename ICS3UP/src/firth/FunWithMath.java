package firth;
import java.util.Scanner;
import java.text.DecimalFormat;

/*Dalton Firth
 * Simple Method Calculator
 * Created: 2016/05/20
 * Prints the sum, difference, product and quotient.
 */

public class FunWithMath {
	
	public static DecimalFormat df = new DecimalFormat("0.00");// formats the results to 2 decimal points

	
	/**
	 * Main starting method for the program
	 * @param args: an array of strings
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numInput1, numInput2 =0;//numbers the user inputs
		Scanner scan = new Scanner(System.in);
		
		//getting the first value from the user
		System.out.println("Input the first number");
		numInput1=scan.nextDouble();
		
		//getting the second value from the user
		System.out.println("Input the first number");
		numInput2=scan.nextDouble();

		//calling the methods to perform the calculation and output the results
		adding(numInput1, numInput2);
		subtracting(numInput1, numInput2);
		multiplying(numInput1, numInput2);
		dividing(numInput1, numInput2);
		
		scan.close();

	}
	/**
	 * Adds the parameters then prints the result
	 * @param num1: double
	 * @param num2: double
	 */
	public static void adding(double num1, double num2)
	{
		System.out.println(num1+" + "+num2+" = "+df.format(num1+num2));
	}
	/**
	 * Subtracts the parameters then prints the result
	 * @param num1: double
	 * @param num2: double
	 */
	public static void subtracting(double num1, double num2)
	{
		System.out.println(num1+" - "+num2+" = "+df.format(num1-num2));
	}
	/**
	 * Multiplies the parameters then prints the result
	 * @param num1: double
	 * @param num2: double
	 */
	public static void multiplying(double num1, double num2)
	{
		System.out.println(num1+" * "+num2+" = "+df.format(num1*num2));
	}
	/**
	 * Divides the parameters then prints the result
	 * @param num1: double
	 * @param num2: double
	 */
	public static void dividing(double num1, double num2)
	{
		System.out.println(num1+" / "+num2+" = "+df.format(num1/num2));
	}

}
