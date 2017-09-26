import java.util.*;

public class DaneWikstromProgram7
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      
      float n = 0;
      float r = 0;
      float pWithr = 0;
      float pWOr = 0;
      float cWithr = 0;
      float cWOr = 0;
      
      System.out.println ("Enter n: ");
      n = in.nextInt();
      
      System.out.println ("Enter r: ");
      r = in.nextInt();
      
      /*TEST CASES
      
      n = 5, r = 4. 
      Permutation with repeats: 625.0
   Permutation without repeats: 120.0
   Combination with repeats: 70.0
   Combination without repeats: 5.0
   
   n = 20, r = 11
   Permutation with repeats: 160000.0
   Permutation without repeats: 116280.01
   Combination with repeats: 8855.0
   Combination without repeats: 4845.0005
   
   n = 10, r = 5
   Permutation with repeats: 100000.0
   Permutation without repeats: 30240.0
   Combination with repeats: 2002.0
   Combination without repeats: 252.0*/
      
      pWithr = (float)Math.pow(n, r);
      System.out.println ("Permutation with repeats: " + pWithr);
      
      pWOr = factorial(n) / (factorial(n-r));
      System.out.println ("Permutation without repeats: " + pWOr);
      
      cWithr = factorial(n+r-1) / (factorial(r) * (factorial((n+r-1) - r)));
      System.out.println ("Combination with repeats: " + cWithr);
      
      cWOr = factorial(n) / (factorial(r) * factorial(n-r));
      System.out.println ("Combination without repeats: " + cWOr);
         
   }
   
   public static float factorial(float n) //factorial
   {
      float fact = 1;
      
      for(int i = 1; i <= n; i++)
      {
         fact *= i;
      }  
      
      return fact;
   }

}

