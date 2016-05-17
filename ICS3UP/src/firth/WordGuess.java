package firth;

import java.util.Scanner;

/*Dalton Firth
 * Word Guesser
 * Created: 2016/05/11
 * A basic game of hangman.
 */

public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] possibleWords = new String[]{"computer","dancer","horse","tarnish","steak","table","age","fork"};//list of possible words
		String guessingWord= null;//user input variable
		String correctWord="";//the word to find
		
		int randomNum = (int) (Math.random()*possibleWords.length);//randomly selects one word from the array
		
		Scanner scan= new Scanner(System.in);
		
		//displays word as hyphens
		for(int i=0;i<possibleWords[randomNum].length();i++)
			correctWord= correctWord+"-";
		
		do{
			//displaying the word to the user
			System.out.println("The word is:");
			System.out.print(correctWord);
			System.out.println("\nEnter a letter or enter ! to guess the word.");
			
			guessingWord= scan.nextLine();//getting input from user
			//letting them guess the word
			if(guessingWord.equals("!")){
				System.out.println("Enter the word you want to guess:");
				guessingWord= scan.nextLine();
				
				if(guessingWord.equalsIgnoreCase(possibleWords[randomNum])){
					correctWord= guessingWord;
				}
				else System.out.println("You are incorrect. The word is"+correctWord);
			}
			//guessing a letter
			else{
				guessingWord.equals(guessingWord.charAt(0));
				int charGuess= possibleWords[randomNum].indexOf(guessingWord);
				
				if (charGuess==-1)System.out.println("there were no "+guessingWord+"'s in the word.");
				else{
					System.out.println("there was a(n) "+guessingWord+" in the word.");
					//replacing a letter in the hyphen word with the guessed letter
					correctWord= correctWord.substring(0,charGuess)+guessingWord+correctWord.substring(charGuess+1,possibleWords[randomNum].length()) ;
				}
			}
			
		}while(!correctWord.equalsIgnoreCase(possibleWords[randomNum]));//loops while word is not guessed
		
		//displays the full word and a victory message
		System.out.println(possibleWords[randomNum]);
		System.out.println("You correctly guessed the word!");
		
		
	}

}
