package firth;

import java.util.*;
public class AgeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String momName = "";
		int momBirthYear =0;
		String childName = "";
		int childBirthYear = 0;
		int ageDifferance=0;

		System.out.println("Enter the year your mother was born:");
		Scanner momBirthYearInput = new Scanner(System.in);
		momBirthYear= Integer.parseInt(momBirthYearInput.nextLine());
		System.out.println("Enter the year you were born:");
		Scanner childBirthYearInput = new Scanner(System.in);
		childBirthYear= Integer.parseInt(childBirthYearInput.nextLine());

		ageDifferance = momBirthYear - childBirthYear;

		System.out.println(ageDifferance);



	}

}
