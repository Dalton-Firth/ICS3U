package firth;

import java.util.*;
/*Dalton Firth
 * Age Assignment
 * Created: 2016/03/09
 * Determines the age of a mother the year that her child was born
 */
public class AgeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String momName = "";
		int momBirthYear =0;
		int childBirthYear = 0;
		int ageDifferance=0;
		
		System.out.println("Enter your mothers name:");
		Scanner momNameInput = new Scanner(System.in);
		momName=momNameInput.nextLine();
		
		System.out.println("Enter the year your mother was born:");
		Scanner momBirthYearInput = new Scanner(System.in);
		momBirthYear= Integer.parseInt(momBirthYearInput.nextLine());
		
		System.out.println("Enter the year you were born:");
		Scanner childBirthYearInput = new Scanner(System.in);
		childBirthYear= Integer.parseInt(childBirthYearInput.nextLine());

		ageDifferance = childBirthYear -momBirthYear;

		System.out.println("Your mother, "+momName+ ", was "+ageDifferance+" years old when you were born.");


 
	}

}
