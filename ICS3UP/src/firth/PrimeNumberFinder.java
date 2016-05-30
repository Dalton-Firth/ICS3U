package firth;
/*Dalton Firth
 * prime number finder
 * Created: 2016/05/30
 * Prints if a number is prime or not
 */
import java.util.Scanner;

public class PrimeNumberFinder {

	/**
	 * Main starting method for the program
	 * @param args string array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numIn=0;//num inputted by user
		
		//getting info from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		numIn=scan.nextInt();
		
		//making the number positive
		if(numIn<0)
			numIn*=-1;
		
		isPrime(numIn);//calling isPrime to find if the inputted value is prime
		
		if (isPrime(numIn)==false)
			System.out.println("Num is not prime");
		else if (isPrime(numIn)==true)
			System.out.println("Num is prime");
		
		
		scan.close();
	}
	/**
	 * Finds whether a number is evenly divisible by another
	 * @param num integer
	 * @param counter integer
	 * @return true if divisible
	 */
	
	public static boolean isDivisible(int num, int counter)
	{

		if(num%counter!=0)
				return (false);
		
		return(true);
	}
	/**
	 * Finds whether a number is prime
	 * @param num integer
	 * @return true if the number is prime
	 */
	
	public static boolean isPrime(int num)
	{
		//0 and 1 are not prime so they are excluded immediately
		if(num==0||num==1)
		{
			return(false);
		}
		
		
		for(int i=2;i<num;i++)
		{
			if(isDivisible(num, i)==true)
			{
				return (false);
				
			}
		}
		return(true);
	}
	
	

}
