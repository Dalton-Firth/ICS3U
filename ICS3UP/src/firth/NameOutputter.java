package firth;
/*Dalton Firth
 * Name Outputter
 * Created: 2016/04/26
 * Outputs a series of names forwards and backwards
 */


import java.util.Scanner;

public class NameOutputter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of names you wish to input:");
		n= Integer.parseInt(scan.nextLine());
		
		String[] names = new String[n];
		
		for(int i=0;i<n;i++)
			{
			System.out.println("Enter a name:");
			names[i]=scan.nextLine();
			}
		for(int i=0;i<n;i++)
		{
		System.out.println(names[i]);
		}
		for(int i=n-1;i>=0;i--)
		{
		System.out.println(names[i]);
		}
		
		
		
		

	}

}
