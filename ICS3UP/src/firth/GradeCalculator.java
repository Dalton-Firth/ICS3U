package firth;

import java.util.Scanner;
/* Dalton Firth
 * Simple Dice Game
 * Created: 2016/03/30
 * Outputs a letter grade based on what percent a student got
 */

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade=0;
		int numOfCourses=0;

		
		System.out.println("Please input the number of courses you wish to have graded.");
		Scanner numOfCourseInput = new Scanner(System.in);
		numOfCourses = Integer.parseInt(numOfCourseInput.nextLine());

		for(int i=0 ; i<=numOfCourses; i++)
		{
			System.out.println("Please input the % grade that was recieved.");
			Scanner gradeInput = new Scanner(System.in);
			grade = Integer.parseInt(gradeInput.nextLine());
			
			if(grade<0 || grade>100)System.out.println("X");
			else if(grade<50)System.out.println("F");
			else if(grade>=50 && grade<60 )System.out.println("D");
			else if(grade>=60 && grade<70 )System.out.println("C");
			else if(grade>=70 && grade<80 )System.out.println("B");
			else System.out.println("A");
		}
		
		
		
	}

}
