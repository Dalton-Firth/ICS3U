package firth;
/*Dalton Firth
 * Dice Outcome Counter
 * Created: 2016/04/26
 * Outputs the number of times a result occurred in 10,000 dice rolls of 2d6
 */
public class ArrayDiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice=0;
		
		int[] rollResults = new int[11];
		
		for(int j=0;j<10000;j++)
		{
			dice=(int)(Math.random()*6+1)+(int)(Math.random()*6+1);
			if(dice==2) rollResults[0]++;
			if(dice==3) rollResults[1]++;
			if(dice==4) rollResults[2]++;
			if(dice==5) rollResults[3]++;
			if(dice==6) rollResults[4]++;
			if(dice==7) rollResults[5]++;
			if(dice==8) rollResults[6]++;
			if(dice==9) rollResults[7]++;
			if(dice==10) rollResults[8]++;
			if(dice==11) rollResults[9]++;
			if(dice==12) rollResults[10]++;
			
		}
		for(int k=0;k<=10;k++)
			System.out.println((k+2)+":"+rollResults[k]);
		
	}

}
