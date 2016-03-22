package firth;

import java.util.Scanner;
/* Dalton Firth
 * Simple If Statement Test
 * Created: 2016/03/22
 * Receive an integer from the user and determine various properties of the integer
 */

public class IfStatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		//Receiving an integer input
		System.out.println("Please enter an integer");
		Scanner numInput = new Scanner(System.in);
		num = Integer.parseInt(numInput.nextLine());
		
		//determining if number is positive
		if(num<0) System.out.println(num+" Is negitive.");
		else System.out.println(num+" Is positive.");
		
		//determining if number is evenly divisible by 7
		if(num%7==0) System.out.println(num+" Is divisible by 7.");
		else System.out.println(num+" Is not divisible by 7.");

	}

}
