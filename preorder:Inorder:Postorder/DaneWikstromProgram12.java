import java.util.*;

public class DaneWikstromProgram12
{
   public static void main (String[] args)
   {   
      TreeNode root = new TreeNode(50); //50, 75, 25, 15, 60, 35, 90, 42, 20, 27, 5, 55, 95, 80, 70
      TreeNode node75 = new TreeNode(75); 
      TreeNode node25 = new TreeNode(25); 
      TreeNode node15 = new TreeNode(15); 
      TreeNode node60 = new TreeNode(60); 
      TreeNode node35 = new TreeNode(35); 
      TreeNode node90 = new TreeNode(90); 
      TreeNode node42 = new TreeNode(42); 
      TreeNode node20 = new TreeNode(20); 
      TreeNode node27 = new TreeNode(27); 
      TreeNode node5 = new TreeNode(5); 
      TreeNode node55 = new TreeNode(55); 
      TreeNode node95 = new TreeNode(95); 
      TreeNode node80 = new TreeNode(80); 
      TreeNode node70 = new TreeNode(70); 
         
      
      root.left = node25;
            
      root.left.left = node15;
      root.left.right = node35;
      
      root.left.left.left = node5;
      root.left.left.right = node20;
      
      root.left.right.left = node27;
      root.left.right.right = node42;
         
      root.right = node75; 
      
      root.right.left = node60;
      root.right.right = node90;
      
      root.right.left.left = node55;
      root.right.left.right = node70;
      
      root.right.right.left = node80;
      root.right.right.right = node95;
      
      
      System.out.print("Preorder: ");
      preOrder(root);
      System.out.println();
     
      System.out.print("Inorder: ");
      inOrder(root);
      System.out.println();
     
      System.out.print("Postorder: ");
      postOrder(root);     
      System.out.println();
   }
      
   public static class TreeNode 
   {
      int visit;
      public TreeNode left;
      public TreeNode right;
     
      public TreeNode(int number)
      {
         visit = number;
         left = right = null;
      }
   }
   
   public static void preOrder(TreeNode root) 
   { 
      if(root != null) 
      { 
         System.out.print(root.visit + ", ");//visit
         preOrder(root.left);//left
         preOrder(root.right);//right
      }
   }
   
   public static void inOrder(TreeNode root) 
   {  
      if(root !=  null) 
      {  
         inOrder(root.left); //left  
         System.out.print(root.visit + ", ");//visit
         inOrder(root.right);//right  
      }  
   }  

   public static void postOrder(TreeNode root)
   {
      if(root !=  null)
      {
         postOrder(root.left);//left
         postOrder(root.right);//right
         System.out.print(root.visit + ", ");//visit
      }    
   }
}