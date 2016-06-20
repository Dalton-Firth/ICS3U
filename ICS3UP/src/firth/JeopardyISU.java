package firth;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import hsa_new.Console;
import java.io.File;
import java.io.IOException;

/* Dalton Firth
 * Jeopardy ISU
 * Created: 2016/06/16
 * A simple game that mimmics jeopardy
 */


public class JeopardyISU {

	public static Console c = new Console();//console

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//setting scores
		int[] scores={0,0,0};
		int bet=0;
		
		//deciding turns
		int turnCount=0;
		double rand1=(Math.random()*100);
		double rand2=(Math.random()*100);
		double rand3=(Math.random()*100);
		
		
		//setting user names
		String name1,name2,name3=null;
		
		//getting answer
		String guess =null;
		String answer=null;
		
		//setting the scores for the board
		String[][] gameBoard=new String[5][6];
		gameBoard[0][0]="200";
		gameBoard[0][1]="200";
		gameBoard[0][2]="200";
		gameBoard[0][3]="200";
		gameBoard[0][4]="200";
		gameBoard[0][5]="200";
		gameBoard[1][0]="400";
		gameBoard[1][1]="400";
		gameBoard[1][2]="400";
		gameBoard[1][2]="400";
		gameBoard[1][3]="400";
		gameBoard[1][4]="400";
		gameBoard[1][5]="400";
		gameBoard[2][0]="600";
		gameBoard[2][1]="600";
		gameBoard[2][2]="600";
		gameBoard[2][3]="600";
		gameBoard[2][4]="600";
		gameBoard[2][5]="600";
		gameBoard[3][0]="800";
		gameBoard[3][1]="800";
		gameBoard[3][2]="800";
		gameBoard[3][2]="800";
		gameBoard[3][3]="800";
		gameBoard[3][4]="800";
		gameBoard[3][5]="800";
		gameBoard[4][0]="1000";
		gameBoard[4][1]="1000";
		gameBoard[4][2]="1000";
		gameBoard[4][3]="1000";
		gameBoard[4][4]="1000";
		gameBoard[4][5]="1000";
		
		
		//setting board colour
		c.setTextBackgroundColor(Color.blue);
		c.setTextColor(Color.yellow);
		c.clear();
		
		//Setting the questions and answers
		String[][] questions=new String[5][6]; 
		String[][] answerTemplate=new String[5][6]; 
		String[] finalQuestion= {"16th CENTURY SCIENTISTS: It is often said of this man that he 'stopped the sun and moved the earth'",
		"WORLD LANDMARKS: Built for a World's Fair in 1889, its visitors that year included the Prince of Wales & Buffalo Bill; it still gets 7M a year",
		"TV CHARACTERS: This 8'2 character who made his debut in 1969 is still going strong",
		"WORD ORIGINS: In the mid-1960s, a decade after it first appeared in a holiday tale, this word came to be used for any mean killjoy"};
		String[] finalAnswers={"copernicus","the eiffel tower","big bird","grinch"};
		
		//French profession names
		questions[0][0]="chanteuse";
		questions[1][0]="Bibliothecaire";
		questions[2][0]="Boulanger";
		questions[3][0]="Avocat";
		questions[4][0]="Pompier";
		
		answerTemplate[0][0]="singer";
		answerTemplate[1][0]="librarian";
		answerTemplate[2][0]="baker";
		answerTemplate[3][0]="lawyer";
		answerTemplate[4][0]="firefighter";
		
		//smallest in area
		questions[0][1]="Mexico,the U.S.,Canada";
		questions[1][1]="Italy,Iceland,Indonesia";
		questions[2][1]="China,Australia,Brazil";
		questions[3][1]="Burma,Thailand,Malaysia";
		questions[4][1]="Bolivia,Peru,Ecuador";
		
		answerTemplate[0][1]="Mexico";
		answerTemplate[1][1]="Iceland";
		answerTemplate[2][1]="Australia";
		answerTemplate[3][1]="Malaysia";
		answerTemplate[4][1]="Ecuador";
		
		//text me
		questions[0][2]="Enough texting; let's meet in person, F2F";
		questions[1][2]="It's been fun, but GTG";
		questions[2][2]="HHOK (it starts with a laugh)";
		questions[3][2]="NOYB, you nosy texter";
		questions[4][2]="To quote the Beach Boys, GOK";
		
		answerTemplate[0][2]="Face to face";
		answerTemplate[1][2]="Got to go";
		answerTemplate[2][2]="ha ha only kidding";
		answerTemplate[3][2]="none of your business";
		answerTemplate[4][2]="God only knows";
		
		//rhyme boss
		questions[0][3]="Apply it to lips for a shiny, attractive appearance";
		questions[1][3]="Angry in Britain";
		questions[2][3]="You do it to a coin or a salad";
		questions[3][3]="It follows 'Spanish' in the name of an air plant";
		questions[4][3]="5-letter term for impure metal or waste matter generally";
		
		answerTemplate[0][3]="Gloss";
		answerTemplate[1][3]="Cross";
		answerTemplate[2][3]="Toss";
		answerTemplate[3][3]="Moss";
		answerTemplate[4][3]="Dross";
		
		//in living colour
		questions[0][4]="Of the 14,000 WWII soldiers who served in the 442nd battalion, 9,486 were awarded this medal";
		questions[1][4]="Ash, cadet & Davy's are 3 shades of this color";
		questions[2][4]="'Kara's Flowers' didn't work, so the band with Adam Levine decided on this name instead";
		questions[3][4]="This deep-water fish named for its color & coarse texture can live to be 140";
		questions[4][4]="The 2 colors that come before 'algae' in another name for cyanobacteria";
		
		answerTemplate[0][4]="Purple Heart";
		answerTemplate[1][4]="gray";
		answerTemplate[2][4]="Maroon 5";
		answerTemplate[3][4]="orange roughy";
		answerTemplate[4][4]="blue and green";
		
		//poker words
		questions[0][5]="An increase in wages";
		questions[1][5]="You get poor treatment if you get a 'raw' one of these";
		questions[2][5]="A rosy glow of the face";
		questions[3][5]="2-word term for why Joseph & Mary were refused lodging";
		questions[4][5]="A steep cliff";
		
		answerTemplate[0][5]="Raise";
		answerTemplate[1][5]="Deal";
		answerTemplate[2][5]="Flush";
		answerTemplate[3][5]="Full house";
		answerTemplate[4][5]="Bluff";
		
		//getting user names
		c.println("please enter the first contenstants name:");
		name1=c.readLine();

		c.println("please enter the second contenstants name:");
		name2=c.readLine();

		c.println("please enter the third contenstants name:");
		name3=c.readLine();
		
		//deciding who goes in what order
		if (rand1 <= rand2) {
			String j = name1;
			name1 = name2;
			name2 = j;
			}

		if (rand2 <= rand3) {
			String j = name2;
			name2 = name3;
			name3 = j;
			}

		if (rand1 <= rand2) {
			String j = name1;
			name1 = name2;
			name2 = j;
		}
		
		c.println("first: "+name1+" second: "+name2+" third: "+name3);
		Thread.sleep(2500);
		c.clear();
		
		//loop for main game
		for(int i=0; i<30; i++)
		{
			//creating game board
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|French Jobs|Smallest Area|Text Me|Rhyme Boss|In Living Colour|Poker Words|");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|    "+gameBoard[0][0]+"    |     "+gameBoard[0][1]+"     |  "+gameBoard[0][2]+"  |   "+gameBoard[0][3]+"    |      "+gameBoard[0][4]+"       |    "+gameBoard[0][5]+"    |");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|    "+gameBoard[1][0]+"    |     "+gameBoard[1][1]+"     |  "+gameBoard[1][2]+"  |   "+gameBoard[1][3]+"    |      "+gameBoard[1][4]+"       |    "+gameBoard[1][5]+"    |");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|    "+gameBoard[2][0]+"    |     "+gameBoard[2][1]+"     |  "+gameBoard[2][2]+"  |   "+gameBoard[2][3]+"    |      "+gameBoard[2][4]+"       |    "+gameBoard[2][5]+"    |");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|    "+gameBoard[3][0]+"    |     "+gameBoard[3][1]+"     |  "+gameBoard[3][2]+"  |   "+gameBoard[3][3]+"    |      "+gameBoard[3][4]+"       |    "+gameBoard[3][5]+"    |");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("|    "+gameBoard[4][0]+"   |     "+gameBoard[4][1]+"    |  "+gameBoard[4][2]+" |   "+gameBoard[4][3]+"   |      "+gameBoard[4][4]+"      |    "+gameBoard[4][5]+"   |");
			c.println("|-----------|-------------|-------|----------|----------------|-----------|");
			c.println("Please select a question: use the format 'french jobs for 200'.");
			//displaying scores
			c.println(name1+": "+scores[0]);
			c.println(name2+": "+scores[1]);
			c.println(name3+": "+scores[2]);
			
			String questChoose= c.readLine().toLowerCase();
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//French questions
			
			if(questChoose.indexOf("fre")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][0]!="   ")
				{
					c.println("name this french profession");
					c.println(questions[0][0]);
					answer=answerTemplate[0][0];
					gameBoard[0][0]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							/*if(turnCount%3==0)
								score1+=200;
							else if(turnCount%3==1)
								score2+=200;
							else if(turnCount%3==2)
								score3+=200;
								*/
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][0]!="   ")
				{
					c.println("name this french profession");
					c.println(questions[1][0]);
					answer=answerTemplate[1][0];
					gameBoard[1][0]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][0]!="   ")
				{
					c.println("name this french profession");
					c.println(questions[2][0]);
					answer=answerTemplate[2][0];
					gameBoard[2][0]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][0]!="   ")
				{
					c.println("name this french profession");
					c.println(questions[3][0]);
					answer=answerTemplate[3][0];
					gameBoard[3][0]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][0]!="   ")
				{
					c.println("name this french profession");
					c.println(questions[4][0]);
					answer=answerTemplate[4][0];
					gameBoard[4][0]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
				
				
			}//end of French questions
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//smallest in area
			else if(questChoose.indexOf("sma")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][1]!="   ")
				{
					c.println("Which country has the smallest area");
					c.println(questions[0][1]);
					answer=answerTemplate[0][1];
					gameBoard[0][1]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][1]!="   ")
				{
					c.println("Which country has the smallest area");
					c.println(questions[1][1]);
					answer=answerTemplate[1][1];
					gameBoard[1][1]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][1]!="   ")
				{
					c.println("Which country has the smallest area");
					c.println(questions[2][1]);
					answer=answerTemplate[2][1];
					gameBoard[2][1]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][1]!="   ")
				{
					c.println("Which country has the smallest area");
					c.println(questions[3][1]);
					answer=answerTemplate[3][1];
					gameBoard[3][1]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][1]!="   ")
				{
					c.println("Which country has the smallest area");
					c.println(questions[4][1]);
					answer=answerTemplate[4][1];
					gameBoard[4][1]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
			}//end of smallest in area
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			//text me
			else if(questChoose.indexOf("text")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][2]!="   ")
				{
					c.println("Enter the words that this texting acronym means:");
					c.println(questions[0][2]);
					answer=answerTemplate[0][2];
					gameBoard[0][2]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][2]!="   ")
				{
					c.println("Enter the words that this texting acronym means:");
					c.println(questions[1][2]);
					answer=answerTemplate[1][2];
					gameBoard[1][2]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][2]!="   ")
				{
					c.println("Enter the words that this texting acronym means:");
					c.println(questions[2][2]);
					answer=answerTemplate[2][2];
					gameBoard[2][2]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][2]!="   ")
				{
					c.println("Enter the words that this texting acronym means:");
					c.println(questions[3][2]);
					answer=answerTemplate[3][2];
					gameBoard[3][2]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][2]!="   ")
				{
					c.println("Enter the words that this texting acronym means:");
					c.println(questions[4][2]);
					answer=answerTemplate[4][2];
					gameBoard[4][2]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
			}//end of text me
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//rhyme boss
			else if(questChoose.indexOf("rhyme")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][3]!="   ")
				{
					c.println("These are all words that rhyme with 'boss'");
					c.println(questions[0][3]);
					answer=answerTemplate[0][3];
					gameBoard[0][3]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][3]!="   ")
				{
					c.println("These are all words that rhyme with 'boss'");
					c.println(questions[1][3]);
					answer=answerTemplate[1][3];
					gameBoard[1][3]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][3]!="   ")
				{
					c.println("These are all words that rhyme with 'boss'");
					c.println(questions[2][3]);
					answer=answerTemplate[2][3];
					gameBoard[2][3]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][3]!="   ")
				{
					c.println("These are all words that rhyme with 'boss'");
					c.println(questions[3][3]);
					answer=answerTemplate[3][3];
					gameBoard[3][3]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][3]!="   ")
				{
					c.println("These are all words that rhyme with 'boss'");
					c.println(questions[4][3]);
					answer=answerTemplate[4][3];
					gameBoard[4][3]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
			}//end of rhyme boss
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//in living colour
			else if(questChoose.indexOf("colo")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][4]!="   ")
				{
					c.println("These words all contain a colour:");
					c.println(questions[0][4]);
					answer=answerTemplate[0][4];
					gameBoard[0][4]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][4]!="   ")
				{
					c.println("These words all contain a colour:");
					c.println(questions[1][4]);
					answer=answerTemplate[1][4];
					gameBoard[1][4]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][4]!="   ")
				{
					c.println("These words all contain a colour:");
					c.println(questions[2][4]);
					answer=answerTemplate[2][4];
					gameBoard[2][4]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][4]!="   ")
				{
					c.println("These words all contain a colour:");
					c.println(questions[3][4]);
					answer=answerTemplate[3][4];
					gameBoard[3][4]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][4]!="   ")
				{
					c.println("These words all contain a colour:");
					c.println(questions[4][4]);
					answer=answerTemplate[4][4];
					gameBoard[4][4]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
			}//end of in living colour
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//poker words
			else if(questChoose.indexOf("poke")!=-1)
			{
				if (questChoose.indexOf("2")!=-1&&gameBoard[0][5]!="   ")
				{
					c.println("These are all common words in poker:");
					c.println(questions[0][5]);
					answer=answerTemplate[0][5];
					gameBoard[0][5]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//200
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("4")!=-1&&gameBoard[1][5]!="   ")
				{
					c.println("These are all common words in poker:");
					c.println(questions[1][5]);
					answer=answerTemplate[1][5];
					gameBoard[1][5]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//400
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("6")!=-1&&gameBoard[2][5]!="   ")
				{
					c.println("These are all common words in poker:");
					c.println(questions[2][5]);
					answer=answerTemplate[2][5];
					gameBoard[2][5]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//600
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("8")!=-1&&gameBoard[3][5]!="   ")
				{
					c.println("These are all common words in poker:");
					c.println(questions[3][5]);
					answer=answerTemplate[3][5];
					gameBoard[3][5]="   ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//800
				else
				{
					c.clear();
					i--;
				}
				if (questChoose.indexOf("10")!=-1&&gameBoard[4][5]!="   ")
				{
					c.println("These are all common words in poker:");
					c.println(questions[4][5]);
					answer=answerTemplate[4][5];
					gameBoard[4][5]="    ";
					
					//loop for all three to have a guess
					for(int j=0;j<3;j++)
					{
						guess = c.readLine();
						if (isRight(answer, guess))
						{
							c.println("correct.");
							scores[turnCount%3]=scoreadder(scores[turnCount%3],questChoose);
							c.clear();
							turnCount++;
							break;
						}
						else
						{
							c.println("incorrect. Next contestant: ");
							scores[turnCount%3]=scoresubtracter(scores[turnCount%3],questChoose);
						}
						turnCount++;
					}
				}//1000
				else
				{
					c.clear();
					i--;
				}
			}//end of poker words
			else
				i--;
		}//END OF FOR LOOP FOR THE BOARD
		c.clear();
		
		//final question
		c.println("The final question of tonights game "+finalQuestion[(int)(Math.random()*4)]);
		if(turnCount%3==0)
		{
			c.println(name1+" enter the amount that you would like to bet(if you have a score of 0 or less your bet will automatically be set to 0):");
			bet=Integer.parseInt(c.readLine());
			if (scores[0]<=0)
				bet=0;
			c.println("enter the answer to the final question");
			guess=c.readLine();
			if(isRight(answer, guess))
				scores[0]+=bet;
			else
				scores[0]-=bet;
			c.clear();
		}
		else if(turnCount%3==1)
		{
			c.println(name2+" enter the amount that you would like to bet(if you have a score of 0 or less your bet will automatically be set to 0):");
			bet=Integer.parseInt(c.readLine());
			if (scores[1]<=0)
				bet=0;
			c.println("enter the answer to the final question");
			guess=c.readLine();
			if(isRight(answer, guess))
				scores[1]+=bet;
			else
				scores[1]-=bet;
			c.clear();
		}
		else if(turnCount%3==2)
		{
			c.println(name3+" enter the amount that you would like to bet(if you have a score of 0 or less your bet will automatically be set to 0):");
			bet=Integer.parseInt(c.readLine());
			if (scores[2]<=0)
				bet=0;
			c.println("enter the answer to the final question");
			guess=c.readLine();
			if(isRight(answer, guess))
				scores[2]+=bet;
			else
				scores[2]-=bet;
			c.clear();
		}
		
		//final scores
		c.println("final scores for tonights game:");
		c.println(name1+": "+scores[0]);
		c.println(name2+": "+scores[1]);
		c.println(name3+": "+scores[2]);
		
	}//end of main method
	
	/**
	 * Method that checks to see if the answer that the user inputted is correct
	 * @param answer String
	 * @param guess String
	 * @return True if correct
	 */
	public static boolean isRight(String answer, String guess)
	{
		if (answer.equalsIgnoreCase(guess))
				{
					return(true);
				}
		return (false);
	}
	/**
	 * Method that adds scores
	 * @param scores int
	 * @param quest String
	 * @return scores
	 */
	public static int scoreadder(int scores, String quest)
	{
		if(quest.indexOf("2")!=-1)
				scores+=200;
		if(quest.indexOf("4")!=-1)
				scores+=400;
		if(quest.indexOf("6")!=-1)
				scores+=600;
		if(quest.indexOf("8")!=-1)
				scores+=800;
		if(quest.indexOf("10")!=-1)
				scores+=1000;
		return(scores);
	}
	/**
	 * Method that adds scores
	 * @param scores int
	 * @param quest String
	 * @return scores
	 */
	public static int scoresubtracter(int scores, String quest)
	{
		if(quest.indexOf("2")!=-1)
				scores-=200;
		if(quest.indexOf("4")!=-1)
				scores-=400;
		if(quest.indexOf("6")!=-1)
				scores-=600;
		if(quest.indexOf("8")!=-1)
				scores-=800;
		if(quest.indexOf("10")!=-1)
				scores-=1000;
		return(scores);
	}
}
