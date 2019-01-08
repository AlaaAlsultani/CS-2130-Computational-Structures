import java.util.*;

public class AlaaAlsultaniProgram5
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      
      String andOr = "";
      String p = "";
      String q = "";
      boolean [] bArrayP = {true, true, false, false};
      boolean [] bArrayQ = {true, false, true, false};
      char pTruthValue = 'T';
      char qTruthValue = 'T';
      char answer = 'T';
      
      do
      {
         System.out.println ("Enter A to AND or V to OR the two propositional variables. A or V are the only valid inputs.");
         andOr = in.nextLine();
      }while (!andOr.equalsIgnoreCase ("A") && !andOr.equalsIgnoreCase ("V"));
      
      do
      {
         System.out.println ("Do you want to NOT p? Enter Y if you do or N if you do not. Y or N are the only vaid inputs.");
         p = in.nextLine();
      }while (!p.equalsIgnoreCase ("Y") && !p.equalsIgnoreCase ("N"));
      
      do
      {
         System.out.println ("Do you want to NOT q? Enter Y if you do or N if you do not. Y or N are the only vaid inputs.");
         q = in.nextLine();
      }while(!q.equalsIgnoreCase ("Y") && !q.equalsIgnoreCase ("N"));
               
      if (p.equalsIgnoreCase ("Y"))//P negation choice
      {
         p = ("~P");
         
         for (int i = 0; i < bArrayP.length; i++) //inverts array to reflect negation
         {
            bArrayP[i] = !bArrayP[i];
         }
      }
      else
      {
         p = ("P");
      }
      
      if (q.equalsIgnoreCase ("Y"))//Q negation choice
      {
         q = ("~Q");
         
         for (int i = 0; i < bArrayQ.length; i++)//inverts array to reflect negation
         {
            bArrayQ[i] = !bArrayQ[i];
         }
      }
      else
      {
         q = ("Q");
      }
      
      System.out.println (" " + p + "    " + q + "    " + p + " " + andOr.toUpperCase() + " " + q);
      System.out.println ("-------------------");
      
      for (int i = 0; i < 4; i++)
      {
         for (int j = 0; j < 1; j++)
         {
               
            if(bArrayP[i] == true)
            {
               pTruthValue = ('T');
            }  
            else
            {
               pTruthValue = ('F');
            }
               
            if(bArrayQ[i] == true)
            {
               qTruthValue = ('T');
            }  
            else
            {
               qTruthValue = ('F');
            }
            if (andOr.equalsIgnoreCase ("A")) //AND calculation
            {
               
               if (bArrayP[i] & bArrayQ[i] == true)
               {
                  answer = ('T');
               }
               else
               {
                  answer = ('F');
               } 
            }
               
            if (andOr.equalsIgnoreCase ("V"))//OR calculation
            {
               if (bArrayP[i] | bArrayQ[i] == true)
               {
                  answer = ('T');
               }
               else
               {
                  answer = ('F');
               } 
            }
              
            System.out.println (" " + pTruthValue + "  |  " +  qTruthValue + "  |   " + answer);
         }
      }      
   }   
}
