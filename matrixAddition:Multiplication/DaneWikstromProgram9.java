import java.util.*;

public class DaneWikstromProgram9
{
   public static void main (String[] args)
   {
   
   /***************    TEST CASES    ************* 
   A:                 A:    
      1 2              1 2           2 4
      3 4      +       3 4     =     6 8
  _______________________________________________
      
   A:                 B:    
      1 2              2 4 6          Number of rows and columns must be the same between both matrices. Try progam again.
      3 4      +       8 9 10    =           
  _______________________________________________
       
   B:                 C:    
      2 4 6             3 6            132 168
      8 9 10      x     9 12     =     255 336
                        15 18
 _______________________________________________
 
   D:                 D:
      10 9 8            10 9 8         195 168 141
      7 6 5             7 6 5          132 114  96 
      4 3 2       x     4 3 2    =     69  60  51
 _______________________________________________
 
 A:                C:
   1 2              3 6  
   3 4      x       9 12       =     Number of rows in one matrix must match the number of columns in the other. Try progam again.
                    15 18   
   */
   
      Scanner in = new Scanner (System.in);
      
      String choice1 = "";
      String choice2 = "";
      String addOrMult = "";
      int[][]matrix1 = {};
      int[][]matrix2 ={};
      
      int[][] matrixA = //2x2
         {
            {1, 2},
            {3, 4}
         };
      
      int[][] matrixB = //2x3
         {
            {2, 4, 6},
            {8, 9, 10}
         };
      
      int[][] matrixC = //3x2
         {
            {3, 6},
            {9, 12},
            {15, 18}
         };
      
      int[][] matrixD = //3x3
         {
            {10, 9, 8},
            {7, 6, 5},
            {4, 3, 2}
         };
      
      System.out.println ("This progam will add or multiply two matrices together. Listed below are your choices to choose from.");
      
      System.out.println ("A: ");
      System.out.println ();
      
      for(int i = 0; i < 2; i++)
      {
         for(int j = 0; j < 2; j++)
         {
            System.out.printf("%3d ", matrixA[i][j]);
         }
         System.out.println();
      }
      
      System.out.println ();
      System.out.println ("B: ");
      System.out.println ();
      
      for(int i = 0; i < 2; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            System.out.printf("%3d ", matrixB[i][j]);
         }
         System.out.println();
      }
      
      System.out.println ();
      System.out.println ("C: ");
      System.out.println ();
      
      for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j < 2; j++)
         {
            System.out.printf("%3d ", matrixC[i][j]);
         }
         System.out.println();
      }
      
      System.out.println ();
      System.out.println ("D: ");
      System.out.println ();
      for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            System.out.printf("%3d ", matrixD[i][j]);
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.print ("Select either A, B, C, or D as your first choice:");
      choice1 = in.nextLine();
      
      if(choice1.equalsIgnoreCase ("A"))
      {
         matrix1 = matrixA;
      }
      if(choice1.equalsIgnoreCase ("B"))
      {
         matrix1 = matrixB;
      }
      if(choice1.equalsIgnoreCase ("C"))
      {
         matrix1 = matrixC;
      }
      if(choice1.equalsIgnoreCase ("D"))
      {
         matrix1 = matrixD;
      }
      
      System.out.println();
      System.out.print ("Select either A, B, C, or D as your second choice: ");
      choice2 = in.nextLine();
      
      if(choice2.equalsIgnoreCase ("A"))
      {
         matrix2 = matrixA;
      }
      if(choice2.equalsIgnoreCase ("B"))
      {
         matrix2 = matrixB;
      }
      if(choice2.equalsIgnoreCase ("C"))
      {
         matrix2 = matrixC;
      }
      if(choice2.equalsIgnoreCase ("D"))
      {
         matrix2 = matrixD;
      }
      
      System.out.println();    
      System.out.println ("A to Add\n"); 
      System.out.println ("M to Multiply\n"); 
      System.out.print ("Choice?: ");
      addOrMult = in.nextLine(); 
      
      if (addOrMult.equalsIgnoreCase("A")) //addition calculation
      {
         int aRows = matrix1.length;
         int aColumns = matrix1[0].length;
         int bRows = matrix2.length;
         int bColumns = matrix2[0].length;
         int[][]matrixAdd = new int[aRows][bColumns];
         int cRows = matrixAdd.length;
         int cColumns = matrixAdd[0].length;
      
         if (aColumns != bRows || bColumns != aRows) 
         {
            throw new IllegalArgumentException("Number of rows and columns must be the same between both matrices. Try progam again.");
         }
         
         System.out.println ();
         System.out.println (choice1 + ": ");
         
         for(int i = 0; i < aRows; i++)
         {
            for(int j = 0; j < aColumns; j++)
            {
               System.out.printf("%3d ", matrix1[i][j]);
            }
            System.out.println();
         }
         
         System.out.println();
         System.out.println ("     +");
         System.out.println ();
         System.out.println (choice2 + ": ");
         
         for(int i = 0; i < bRows; i++)
         {
            for(int j = 0; j < bColumns; j++)
            {
               System.out.printf("%3d ", matrix2[i][j]);
            }
            System.out.println();
         }
         
         System.out.println();
         System.out.println("     =");
         System.out.println();

         for (int i = 0; i < aRows; i++) 
         { 
            for (int j = 0; j < bColumns; j++) 
            { 
               for (int k = 0; k < aColumns; k++) 
               { 
                  matrixAdd[i][j] = matrix1[i][k] + matrix2[k][j];       
               }
            } 
         } 
         
         for (int i = 0; i < aRows; i++)
          {
              for (int j = 0; j < matrix1[i].length; j++)
              {
                  matrixAdd[i][j] = matrix1[i][j] + matrix2[i][j];
              }
          }
          
         for(int i = 0; i < cRows; i++)
         {
            for(int j = 0; j < cColumns; j++)
            {
               System.out.printf("%3d ", matrixAdd[i][j]);
            }
            System.out.println();
         }      
      }//end if for add
      
      if (addOrMult.equalsIgnoreCase("M")) //multiplication calculation
      {
         int aRows = matrix1.length;
         int aColumns = matrix1[0].length;
         int bRows = matrix2.length;
         int bColumns = matrix2[0].length;
         int[][]matrixMult = new int[aRows][bColumns];
         int cRows = matrixMult.length;
         int cColumns = matrixMult[0].length;
      
         if (aColumns != bRows) 
         {
            throw new IllegalArgumentException("Number of rows in one matrix must match the number of columns in the other. Try progam again.");
         }
        
         System.out.println ();
         System.out.println (choice1 + ": ");
         
         for(int i = 0; i < aRows; i++)
         {
            for(int j = 0; j < aColumns; j++)
            {
               System.out.printf("%3d ", matrix1[i][j]);
            }
            System.out.println();
         }
         
         System.out.println();
         System.out.println ("     x");
         System.out.println ();
         System.out.println (choice2 + ": ");
         
         for(int i = 0; i < bRows; i++)
         {
            for(int j = 0; j < bColumns; j++)
            {
               System.out.printf("%3d ", matrix2[i][j]);
            }
            System.out.println();
         }
         
         System.out.println();
         System.out.println("     =");
         System.out.println();

         for (int i = 0; i < aRows; i++) 
         { 
            for (int j = 0; j < bColumns; j++) 
            { 
               for (int k = 0; k < aColumns; k++) 
               { 
                  matrixMult[i][j] += matrix1[i][k] * matrix2[k][j];       
               }
            } 
         } 
          
         for(int i = 0; i < cRows; i++)
         {
            for(int j = 0; j < cColumns; j++)
            {
               System.out.printf("%3d ", matrixMult[i][j]);
            }
            System.out.println();
         }     
      }//end if for mult
   }//end main
}//end class

