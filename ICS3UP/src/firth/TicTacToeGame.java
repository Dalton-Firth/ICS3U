package firth;

import java.util.Scanner;
/*Dalton Firth
 * Dice Outcome Counter
 * Created: 2016/05/13
 * A basic game of tic-tac-toe.
 */

public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gameBoard[][]=new String[3][3];//array of possible moves
		
		//variables for coordinates
		int colum=0;
		int row=0;
		
		int turnCounter=0;//determines whose turn it is
		
		//determining game end/replay
		boolean gameEnd=false;
		boolean replay=false;
		
		String playAgain=null;
		
		
		//setting the moves to blank
		 gameBoard[0][0]=" ";
		 gameBoard[0][1]=" ";
		 gameBoard[0][2]=" ";
		 gameBoard[1][0]=" ";
		 gameBoard[1][1]=" ";
		 gameBoard[1][2]=" ";
		 gameBoard[2][0]=" ";
		 gameBoard[2][1]=" ";
		 gameBoard[2][2]=" ";
		
		Scanner scan= new Scanner(System.in);
		
		do{
		
			replay=false;
		do{
			//making board
			System.out.println("       |       |       ");
			System.out.println("   "+gameBoard[0][0]+"   |   "+gameBoard[1][0]+"   |   "+gameBoard[2][0]+"   ");
			System.out.println("       |       |       ");
			System.out.println("-----------------------");
			System.out.println("       |       |       ");
			System.out.println("   "+gameBoard[0][1]+"   |   "+gameBoard[1][1]+"   |   "+gameBoard[2][1]+"   ");
			System.out.println("       |       |       ");
			System.out.println("-----------------------");
			System.out.println("       |       |       ");
			System.out.println("   "+gameBoard[0][2]+"   |   "+gameBoard[1][2]+"   |   "+gameBoard[2][2]+"   ");
			System.out.println("       |       |       ");
			
			
			//getting move input
			System.out.println("Please input the colum you wish to make a move:");
			colum=Integer.parseInt(scan.nextLine());
			
			System.out.println("Please input the row you wish to make a move:");
			row=Integer.parseInt(scan.nextLine());
			
			
			
			//determining who places the point X or O and preventing multiple moves on the same spot
			if(turnCounter%2==0)
			{
				if(!gameBoard[colum-1][row-1].equalsIgnoreCase(" "))
				{
					System.out.println("There was already someone there");
					turnCounter++;
				}
				else
					gameBoard[colum-1][row-1]="X";
			}
			else
				if(!gameBoard[colum-1][row-1].equalsIgnoreCase(" "))
				{
					System.out.println("There was already someone there");
					turnCounter++;
				}
				else
					gameBoard[colum-1][row-1]="O";
					
			
			
			//determining win conditions/tie game
			if(gameBoard[0][0]==gameBoard[0][1]&&gameBoard[0][1]==gameBoard[0][2]&& !gameBoard[0][2].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[1][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[1][2]&& !gameBoard[1][2].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[2][0]==gameBoard[2][1]&&gameBoard[2][1]==gameBoard[2][2]&& !gameBoard[2][2].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[0][0]==gameBoard[1][0]&&gameBoard[1][0]==gameBoard[2][0]&& !gameBoard[1][0].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[0][1]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][1]&& !gameBoard[1][1].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[0][2]==gameBoard[1][2]&&gameBoard[1][2]==gameBoard[2][2]&& !gameBoard[1][2].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]&& !gameBoard[1][1].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			if(gameBoard[0][2]==gameBoard[1][2]&&gameBoard[1][1]==gameBoard[2][0]&& !gameBoard[1][1].equals(" "))
			{
				gameEnd=true;
				System.out.println("You Win!");
			}
			
			if (!gameBoard[0][0].equals(" ") && !gameBoard[0][1].equals(" ") && !gameBoard[0][2].equals(" ")
					&& !gameBoard[1][0].equals(" ") && !gameBoard[1][1].equals(" ") && !gameBoard[1][2].equals(" ")
					&& !gameBoard[2][0].equals(" ") && !gameBoard[2][1].equals(" ") && !gameBoard[2][2].equals(" "))
			{
				gameEnd = true;
				System.out.println("Cat's game!");
			}
			
			
			
			
			
			turnCounter++;
		}while(gameEnd==false);
		
		//asking for replay
		System.out.println("Play again? (Y/N)");
		playAgain= scan.nextLine();

		//reseting game board
		if(playAgain.equalsIgnoreCase("Y"))
		{
			gameBoard[0][0]=" ";
			gameBoard[0][1]=" ";
		 	gameBoard[0][2]=" ";
		 	gameBoard[1][0]=" ";
		 	gameBoard[1][1]=" ";
		 	gameBoard[1][2]=" ";
		 	gameBoard[2][0]=" ";
		 	gameBoard[2][1]=" ";
		 	gameBoard[2][2]=" ";
		 	gameEnd=false;
		 	replay=true;
		}
		
		}while(replay==true);
		
	}

}
