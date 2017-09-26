import java.util.*;

public class DaneWikstromProgram10
{
   public static void main (String[] args)
   {
      /*                TEST CASES 
      
      1 2
      3 4
      4 2
      2 2
      -100 0
      n      
      Domain = [1, 3, 4, 2, -100]
      Range = [2, 4, 0]
      Relation = {(1,2),(3,4),(4,2),(2,2),(-100,0),}
      
      **********************************************
      
      1 2
      2 1
      3 2
      4 5
      n
      Domain = [1, 2, 3, 4]
      Range = [2, 1, 5]
      Relation = {(1,2),(2,1),(3,2),(4,5),}
      
      **********************************************
      
      1 2
      3 4
      4 5 6
      n
      Invalid series of ordered pairs comprised of integers. Try program again.
      
      **********************************************
      
      1    4
   
      56 90000
      3 -135
      n
      Domain = [1, 56, 3]
      Range = [4, 90000, -135]
      Relation = {(1,4),(56,90000),(3,-135),}      
      */
      Scanner in = new Scanner(System.in);
      
      ArrayList<Integer> userInputList = new ArrayList<Integer>();
      Set<Integer> range = new LinkedHashSet<Integer>();
      Set<Integer> domain = new LinkedHashSet<Integer>();
      ArrayList<Integer> relationD = new ArrayList<Integer>();
      ArrayList<Integer> relationR = new ArrayList<Integer>();
      
      System.out.println ("Enter a series of ordered pairs comprised of integers; for example:\n 1 54 \n 3 5\n 10 92\n Press 'n' to end.");
      try
      {
         try
         {
            while(!userInputList.equals ('n'))
            {   
               userInputList.add(in.nextInt());
               
               if (in.hasNextInt()) 
               {
                  userInputList.add(in.nextInt());
               } 
               else 
               {
                  userInputList = null;
               }
            }   
         }
         catch(NullPointerException q)
         {
            System.out.println ("Invalid series of ordered pairs comprised of integers. Try program again.");
            System.exit(0);
         }
      }     
      catch(InputMismatchException e)
      {         
         for(int i = 0; i < userInputList.size(); i+=2) //Domain
         {
            domain.add(userInputList.get(i));
            relationD.add(userInputList.get(i));
         }
         System.out.println ("Domain = " + domain);
          
         for(int i = 1; i < userInputList.size(); i+=2)//Range
         {
            range.add(userInputList.get(i));
            relationR.add(userInputList.get(i));
         }
         System.out.println ("Range = " + range);
      
         System.out.print ("Relation = {");//Relation      
         for(int i = 0; i < userInputList.size() / 2; i++)
         {          
             System.out.print ("(" + relationD.get(i) + "," + relationR.get(i) + "),");     
         }
         System.out.println ("}");
      }     
   }
}
