/*It seems that there is a 50/50 chance of winning after the first door is opened with the goat because now the contestant 
has the choice of picking another door or staying; kind of like choosing heads or tails. Therefore, I'm going to conclude that there is a 50/50 chance*/
 
import java.util.*;

public class DaneWikstromProgram8
{
   public static void main (String[] args)
   {
      Random random = new Random();
      
      double change = 0;
		double stay = 0;
		
		for(int i = 0; i <= 100000; i++)
      {
			int[] doors = {0,0,0};//array with three "doors" to choose from
			
         doors[random.nextInt(3)] = 1;//out of three doors put a value of 1 in one of the three doors to represent the door with money
         
         int rChoice = random.nextInt(3); //out of three doors pick a door at random. Door 1, 2, or 3??
			int firstGoatDoor; 
			
         do
         {
				firstGoatDoor = random.nextInt(3);
            			
			}while(doors[firstGoatDoor] == 1 || firstGoatDoor == rChoice); //make sure that the shown door does not equal the winning door or the choice. 
                                                                        //Remeber, the first door opened is ALWAYS a goat.       
			stay +=doors[rChoice];
			
			change += doors[3 - rChoice - firstGoatDoor];
		}   
      
      change = (change / 100000) * 100;
      stay = (stay / 100000) * 100;
      
		System.out.println("If the contestant switches doors the contestent wins " + (String.format("%.2f", change)) + "% of the time out of 100,000 rounds." );
		System.out.println("If the contestant doesn't switch doors the contestent wins " + (String.format("%.2f", stay)) + "% of the time out of 100,000 rounds." );
   }
}