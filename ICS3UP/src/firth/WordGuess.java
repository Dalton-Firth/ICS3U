package firth;

import java.util.Scanner;

/*Dalton Firth
 * Dice Outcome Counter
 * Created: 2016/05/11
 * A basic game of hangman.
 */

public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] possibleWords = new String[]{"computer","dancer","horse","tarnish","steak","table","age","fork"};
		String guessingWord= null;
		String correctWord="";
		
		int randomNum = (int) (Math.random()*possibleWords.length);
		int guessCounter=0;
		
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<possibleWords[randomNum].length();i++)
			correctWord= correctWord+"-";
		
		do{
			System.out.println("The word is:");
			
			System.out.print(correctWord);
			System.out.println("\nEnter a letter or enter ! to guess the word.");
			
			guessingWord= scan.nextLine();
			
			if(guessingWord.equals("!")){
				System.out.println("Enter the word you want to guess:");
				guessingWord= scan.nextLine();
				
				if(guessingWord.equalsIgnoreCase(possibleWords[randomNum])){
					correctWord= guessingWord;
				}
				else System.out.println("You are incorrect. The word is"+correctWord);
			}
			else{
				int charGuess= possibleWords[randomNum].indexOf(guessingWord);
				
				if (charGuess==-1)System.out.println("there were no "+guessingWord+"'s in the word.");
				else{
					System.out.println("there was a(n) "+guessingWord+" in the word.");
					
					correctWord= correctWord.substring(0,charGuess)+guessingWord+correctWord.substring(charGuess+1,possibleWords[randomNum].length()) ;
				}
			}
			
			
			
			
			
			
			
			
		}while(!correctWord.equalsIgnoreCase(possibleWords[randomNum]));
		
		System.out.println(possibleWords[randomNum]);
		System.out.println("You correctly guessed the word!");
		
		
	}

}
