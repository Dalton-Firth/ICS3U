package firth;

import java.util.Scanner;
/* Dalton Firth
 * Name love/hate
 * Created: 2016/03/22
 * Gets a name from user and gives an answer based off a random number
 */

public class NameLoveOrHate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="";
		
		//gets input
		System.out.println("Please enter your name");
		Scanner nameInput= new Scanner(System.in);
		name = nameInput.nextLine();
		
		//decides outcome by a random number
		if(Math.random()<=0.3) System.out.println(name+" is my favourite name");
		else System.out.println("I hate the name "+name);

	}

}
