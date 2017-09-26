import java.util.*;

public class DaneWikstromProgram11
{
   public static void main (String[] args)
   {
      int[][] matrixA =
         {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
         };
      int[][] matrixB =
         {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {1, 1, 1, 0}
         };
      int[][] matrixC =
         {
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
         };
      int[][] matrixD =
         {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
         };
         
      String ar = reflexive(matrixA);
      String air = irreflexive(matrixA); 
      String as = symmetric(matrixA); 
      String aas = asymmetric(matrixA);
      String aanti = antisymmetric(matrixA);
      
      System.out.println();  
      System.out.println ("Matrix A:\n");
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            System.out.printf("%3d ", matrixA[i][j]);
         }
         System.out.println();
      }
      System.out.println();
      System.out.println ("Reflexive: " + ar+ ("\n") + ("Irreflexive: ") + air + "\n" + ("Symmetric: ") + as + "\n" 
         + ("Asymmetric: ") + aas + ("\n") + ("Antisymmetric: ") + aanti);
      System.out.println ();
         
      String br = reflexive(matrixB);  
      String bir = irreflexive(matrixB); 
      String bs = symmetric(matrixB); 
      String bas = asymmetric(matrixB);
      String banti = antisymmetric(matrixB);
      
      System.out.println();
      System.out.println ("Matrix B:\n");
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            System.out.printf("%3d ", matrixB[i][j]);
         }
         System.out.println();
      }
      System.out.println();
      System.out.println ("Reflexive: " + br+ ("\n") + ("Irreflexive: ") + bir + "\n" + ("Symmetric: ") + bs + "\n" 
         + ("Asymmetric: ") + bas + ("\n") + ("Antisymmetric: ") + banti);
      System.out.println ();
      
      String cr = reflexive(matrixC); 
      String cir = irreflexive(matrixC);
      String cs = symmetric(matrixC);
      String cas = asymmetric(matrixC);
      String canti = antisymmetric(matrixC); 
       
      System.out.println();
      System.out.println ("Matrix C:\n");
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            System.out.printf("%3d ", matrixC[i][j]);
         }
         System.out.println();
      }
      System.out.println();
      System.out.println ("Reflexive: " + cr+ ("\n") + ("Irreflexive: ") + cir + "\n" + ("Symmetric: ") + cs + "\n" 
         + ("Asymmetric: ") + cas + ("\n") + ("Antisymmetric: ") + canti);
      System.out.println ();
      
      String dr = reflexive(matrixD);
      String dir = irreflexive(matrixD);
      String ds = symmetric(matrixD);
      String das = asymmetric(matrixD);
      String danti = antisymmetric(matrixD);
      
      System.out.println();
      System.out.println ("Matrix D:\n");
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            System.out.printf("%3d ", matrixD[i][j]);
         }
         System.out.println();
      }
      System.out.println();
      System.out.println ("Reflexive: " + dr+ ("\n") + ("Irreflexive: ") + dir + "\n" + ("Symmetric: ") + ds + "\n" 
         + ("Asymmetric: ") + das + ("\n") + ("Antisymmetric: ") + danti);
      System.out.println ();
   }
   
   
   public static String reflexive(int[][] matrix)
   {
      String answer = "";
      
      for(int i = 0; i < 4 ; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(matrix[i][j + i] != 1)
            {
               answer = ("No");
               return answer;
            }
            else
            {
               answer = ("Yes");
               break;
            }
         }
      }        
      return answer;
   }
   
   public static String irreflexive (int[][] matrix)
   {
      String answer = "";
      
      for(int i = 0; i < 4 ; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(matrix[i][j + i] == 1)
            {
               answer = ("No");
               return answer;
            }
            else
            {
               answer = ("Yes");
               break;
            }
         }
      }        
      return answer;
   }
   
   public static String symmetric(int[][] matrix)
   {
      String answer = "";
   
      for (int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(matrix[i][j] == 1)
            {
               if(matrix[i][j] != matrix[j][i])
               {
                  answer = ("No");
                  return answer;
               }
            }
            else
            {
               answer = ("Yes");
               continue;
            }
         }
      }
      answer = ("Yes");
      return answer;
   }
   
   public static String asymmetric(int[][] matrix)
   {
      String answer = "";
      
      for(int i = 0; i < 4 ; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(matrix[i][j] != matrix[j][i])
            {
               answer = ("Yes");
               return answer;
            } 
            else
            {
               answer = ("No");
               return answer;
            }
         }
      }      
      return answer;
   }
   
   public static String antisymmetric(int[][] matrix)
   {
      String answer = "";
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(matrix[i][j] == 1)
            {
               if(matrix[i][j] == matrix[j][i])
               {
                  if(i != j)
                  {
                     answer = ("No");
                     return answer;
                  }
                  else
                  {
                     break;
                  }
               }              
            }
         }
      }   
      answer = ("Yes");
      return answer;
   }
}