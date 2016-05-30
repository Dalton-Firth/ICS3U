package firth;

import java.util.Scanner;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numIn=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		numIn=scan.nextInt();
		
		if(numIn<0)
			numIn*=-1;
		
			isPrime(numIn);
		
		if (isPrime(numIn)==false)
			System.out.println("Num is not prime");
		else if (isPrime(numIn)==true)
			System.out.println("Num is prime");
		
		
		scan.close();
	}
	
	public static boolean isDivisible(int num, int counter)
	{

		if(num%counter!=0)
				return (false);
		
		return(true);
	}
	
	public static boolean isPrime(int num)
	{
		
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
