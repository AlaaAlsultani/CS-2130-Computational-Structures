import java.util.*;
 
public class DaneWikstromProgram4
{    
   public static void main(String[] args) 
   {
      Scanner in = new Scanner (System.in);
        
      String userInput = "";
      String binary = "";
      String octal = "";
      String hexadecimal = "";
      char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      boolean hasError = false;
      int number = 0;
      int userInput2 = 0;
      int userInput8 = 0;
      int userInput16 = 0;
      int remainder2 = 0;
      int remainder8 = 0;
      int remainder16 = 0;
      
      do //for program looping until terminated by user
      {       
         do //for exception handling
         {
            try
            { 
               do // for numbers < 0
               {
                  binary = ""; //sets to necessary starting value while looping. 
                  octal = "";
                  hexadecimal = "";
                  
                  System.out.println("Enter a decimal value number to be converted to base 2, 8, and 16. Press 'q' to terminate the program.");
                  userInput = in.nextLine();
               
                  if(userInput.equalsIgnoreCase ("q"))
                  {
                     System.exit(0);
                  }
               
                  number = Integer.parseInt(userInput);
               
                  if (number < 0)
                  {
                     System.out.println ("Invalid entry. Only a number greater than or equal to zero in numerical format is valid.");
                  }
               
               }while(number < 0);
            
               hasError = false;
            }
            
            catch (NumberFormatException e)
            {  
               System.out.println ("Invalid entry. Only numbers are valid.");
            
               hasError = true;
            }
         
         }while (hasError);        
        
         
         userInput2 = Integer.parseInt(userInput);
         userInput8 = Integer.parseInt(userInput);
         userInput16 = Integer.parseInt(userInput);
      
         do //binary calculation
         {
            remainder2 = userInput2 % 2; 
            binary = remainder2 + binary;       
            userInput2 = userInput2/2; 
         
         }while (userInput2 != 0);
      
         do //octal calculation
         {
            remainder8 = userInput8%8;          
            octal = remainder8 + octal;         
            userInput8 = userInput8/8;
         
         }while (userInput8 != 0);
      
         do //hexadecimal calculation
         {
            remainder16 = userInput16%16;
            hexadecimal =  hex[remainder16] + hexadecimal;       
            userInput16 = userInput16/16;
         
         }while (userInput16 != 0);
      
         System.out.println("Binary: " +binary);
         System.out.println("Octal: "+octal);
         System.out.println("HexaDecimal: "+hexadecimal);
         System.out.println ("");
      
      }while(true);
   }
}