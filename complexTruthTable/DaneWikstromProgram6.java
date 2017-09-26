import java.util.*;

public class DaneWikstromProgram6
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      
      boolean[] a = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
      boolean[] b = {true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false};
      boolean[] c = {true,true,true,true,false,false,false,false,true,true,true,true,false,false,false,false,true,true,true,true,false,false,false,false,true,true,true,true,false,false,false,false};
      boolean[] d = {true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false,true,true,false,false};
      boolean[] e = {true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false};
      boolean answer = true;
      char aTruthValue = 'T';
      char bTruthValue = 'T';
      char cTruthValue = 'T';
      char dTruthValue = 'T';
      char eTruthValue = 'T';
      char answerTruthValue = 'T';
           
      
      System.out.println (" a  |  b  |  c  |  d  |  e  |  (( c V ~d ) A b ) A ~( d V a A e ))");  
      System.out.println ("------------------------------------------------------------------");
       
      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < 1; j++)
         {
            if(a[i] == true)
            {
               aTruthValue = ('T');
            }  
            else
            {
               aTruthValue = ('F');
            }
               
            if(b[i] == true)
            {
               bTruthValue = ('T');
            }  
            else
            {
               bTruthValue = ('F');
            }
            if(c[i] == true)
            {
               cTruthValue = ('T');
            }  
            else
            {
               cTruthValue = ('F');
            }
               
            if(d[i] == true)
            {
               dTruthValue = ('T');
            }  
            else
            {
               dTruthValue = ('F');
            }
            if(e[i] == true)
            {
               eTruthValue = ('T');
            }  
            else
            {
               eTruthValue = ('F');
            }
            
            answer = ((b[i] & (c[i] | !d[i])) & ((!d[i] & !a[i]) | !e[i])); //calculation of answer
            
            if (answer == true)
            {
               answerTruthValue = ('T');
            }
            else
            {
               answerTruthValue = ('F');
            }
            
            System.out.println (" " + aTruthValue + "  |  " +  bTruthValue + "  |  " + cTruthValue + "  |  " +  dTruthValue + "  |  " + eTruthValue + "  |             " + answerTruthValue);
         }
      }
   }
}