import java.util.*;

public class DaneWikstromProgram2 //hash value of a valid string of characters
{   
   public static void main (String[] args) 
   {
      Scanner in = new Scanner (System.in);
          
      /*TEST CASES
      
      *Enter 100% for sentence to be hashed. Prompt of valid string characters will be prompted.
      
      *Enter aBcDe for sentence to be hashed. Value will be = 15. 
      *Enter abcde for sentence to be hashed. Value will be = 15. Program treats upper and lower case letters as the same value.
      
      *Enter into the console one (1) space followed by 'a' , i.e. ' 'a. Value will be = 1. ' ' = 31. 'a' = 1. 31+1 = 32. 32 % 31 = 1. 
      
      *Press enter/return at anytime to exit the program.
      */   
      
      String sentence = new String();
      
      int letterValue = 0;
      int hashValue = 0;
         
      System.out.println("Enter the string of characters you would like hashed. Press enter/return at any time to exit the program.");
   
      sentence = in.nextLine();
      
      do 
      {      
         char[] sentenceCharArray = sentence.toCharArray();
      
         for (int i = 0; i < sentenceCharArray.length; i++) 
         {
         
            switch (sentenceCharArray[i]) 
            {
               case 'A':             
               case 'a':               
                  letterValue += 1;
                  break;
               case 'B':
               case 'b':
                  letterValue += 2;
                  break;
               case 'C':
               case 'c':
                  letterValue += 3;
                  break;
               case 'D':
               case 'd':
                  letterValue += 4;
                  break;
               case 'E':
               case 'e':
                  letterValue += 5;
                  break;
               case 'F':
               case 'f':
                  letterValue += 6;
                  break;
               case 'G':
               case 'g':
                  letterValue += 7;
                  break;
               case 'H':
               case 'h':
                  letterValue += 8;
                  break;
               case 'I':
               case 'i':
                  letterValue += 9;
                  break;
               case 'J':
               case 'j':
                  letterValue += 10;
                  break;
               case 'K':
               case 'k':
                  letterValue += 11;
                  break;
               case 'L':
               case 'l':
                  letterValue += 12;
                  break;
               case 'M':
               case 'm':
                  letterValue += 13;
                  break;
               case 'N':
               case 'n':
                  letterValue += 14;
                  break;
               case 'O':
               case 'o':
                  letterValue += 15;
                  break;
               case 'P':
               case 'p':
                  letterValue += 16;
                  break;
               case 'Q':
               case 'q':
                  letterValue += 17;
                  break;
               case 'R':
               case 'r':
                  letterValue += 18;
                  break;
               case 'S':
               case 's':
                  letterValue += 19;
                  break;
               case 'T':
               case 't':
                  letterValue += 20;
                  break;
               case 'U':
               case 'u':
                  letterValue += 21;
                  break;
               case 'V':
               case 'v':
                  letterValue += 22;
                  break;
               case 'W':
               case 'w':
                  letterValue += 23;
                  break;
               case 'X':
               case 'x':
                  letterValue += 24;
                  break;
               case 'Y':
               case 'y':
                  letterValue += 25;
                  break;
               case 'Z':
               case 'z':
                  letterValue += 26;
                  break;
               case ' ':
                  letterValue += 31;
                  break;
               default:
                  break;
            }              
         }
          
         if (letterValue == 0)
         {
            System.out.println ("Only English alphabet letters, nameley a-z, and spaces will result in a hashed value. Your string of characters is not valid.");
            System.out.println ("Enter a valid string of characters.");
         }         
          
         if (letterValue != 0)
         {
            hashValue = letterValue % 31;
            System.out.println (sentence + " = " + hashValue);
            letterValue = 0;
         }
          
         System.out.println ("Enter the string of characters you would like hashed. Press enter/return at any time to exit the program.");
         sentence = in.nextLine();
            
      }while (!sentence.equals (""));   
         
   }
   
}