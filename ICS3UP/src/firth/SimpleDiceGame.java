package firth;

/* Dalton Firth
 * Simple Dice Game
 * Created: 2016/03/23
 * Performs 4 random rolls from 1-6 and adds 2 sets together to determine a winner
 */

public class SimpleDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the dice
		int die1=0;
		int die2=0;
		int die3=0;
		int die4=0;
		
		//user dice
		die1= (int)(Math.random()*6+1);
		die2= (int)(Math.random()*6+1);
		//computer dice
		die3= (int)(Math.random()*6+1);
		die4= (int)(Math.random()*6+1);
		
		//displaying the results of the dice rolls to the user
		if(die1+die2<die3+die4) System.out.println("You got "+(die1+die2)+" and the computer got "+(die3+die4)+" You Lose!");
		else if(die1+die2==die3+die4) System.out.println("You got "+(die1+die2)+" and the computer also got "+(die3+die4)+" You Tied!");
		else System.out.println("You got "+(die1+die2)+" and the computer got "+(die3+die4)+" You Win!");
	}

}
