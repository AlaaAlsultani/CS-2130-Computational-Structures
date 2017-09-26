import java.util.*;

public class DaneWikstromProgram1 //union, intersection, and difference
{
   
   public static void main (String[] args) 
   {
   
      int[] intArrayA = {1, 3, 5, 6, 8};
      int[] intArrayB = {2, 3, 4, 7, 9,}; 
      int counter = 0;
      ArrayList listU = new ArrayList();
      ArrayList listI = new ArrayList();
      ArrayList listD = new ArrayList();
      
      
      System.out.println ("Set A = {1, 3, 5, 6, 8} and set B = {2, 3, 4, 7, 9}.");
      System.out.println ("\n");
      
      //union
      /*
      *every int in set A is added to listU
      *every int in set B is added to listU
      *hashset prevents duplicates, hence needed to properly display union
      *adds all in listU to hashset
      *Without listU.clear(), intArrayA, intArrayB, and union are in listU 
      *listU.addAll(hashSet)adds union array only to listU
      *prints all non repeating ints in both sets
      */
      
      System.out.print ("The union of set A and B is: "); //Answer: {1,2,3,4,5,6,7,8,9}
      for (int i=0; i<intArrayA.length; i++)
      {
         listU.add(intArrayA[i]);                
      }
      
      for(int j=0; j<intArrayB.length; j++)
      {
         listU.add(intArrayB[j]);
      } 
         
      HashSet hashSet = new HashSet();           
      hashSet.addAll(listU);                     
      listU.clear();                             
      listU.addAll(hashSet);                     
      System.out.println(listU);
      System.out.println ("\n");
      
      
      //Intersection
      /*
      *int in position 0 in set A checks every int in set B.
      *if that particular int is equal to a particular int in set B, then that int in set A is added to listI.
      *first for loops starts again in position 1 in set A and repeats.
      *once every int in set A is compared to every int in set B and all intersecting values are added to listI, the system prints the intersection of both sets.
      */
      
      System.out.print ("The intersection of set A and B is: "); //Answer: {3}
      for (int i=0; i<intArrayA.length; i++)
      { 
         for(int j=0; j<intArrayB.length; j++)
         {
            if (intArrayA[i] == intArrayB[j])
            {
               listI.add(intArrayA[i]); 
            }
         }   
      }
         
      System.out.println (listI); 
      System.out.println ("\n");
         
   
      //difference
      /*
      *int in position 0 in set A checks every int in set B.
      *If that particular int is not equal to a particular int in set B, then the couter variable is incremented.
      *once counter equals the length of set B the program knows that that int in set A checked every int in set B and was not repeated and is added to listD.
      *first for loop starts over and test position 1 in set A and repeats.
      *once every int in set A is tested, the program prints every int in set A that didn't intersect with set B.
      */
      
      System.out.print("The difference of A-B is: "); //Answer = {1, 5, 6, 8}
      for (int i=0; i<intArrayA.length; i++) 
      {
         counter = 0;
      
         for (int j=0; j<intArrayB.length; j++) 
         {
            if ((intArrayA[i] != intArrayB[j])) 
            {
               counter++;
            }
                 
            if (counter == intArrayB.length) 
            {
               listD.add(intArrayA[i]);
            }
             
         }
      }
      System.out.println(listD);
        
   }
   
}