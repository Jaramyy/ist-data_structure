import java.util.ArrayList;

public class BSTInt {
    private TreeCell<Integer> root;

    public BSTInt() {
        root = null;
    }

    // this method inserts an integer x into this BSTInt
    public void insert(Integer x) {
        root = insert(x, root);
    }

    // helper method called by the public insert method
    private static TreeCell<Integer> insert(Integer x, TreeCell<Integer> root) {
        if (root == null)
            return new TreeCell<Integer>(x, null, null);
        else if ((root.getDatum().compareTo(x)) >= 0)
            root.setLeft(insert(x, root.getLeft()));
        else
            root.setRight(insert(x, root.getRight()));
        return root;
    }

    // this method prints a BST with the root rotated left by 90 degrees
    public void printTree() {
        printTree(root, 0);
    }

    // helper method called by the public printTree method
    private static void printTree(TreeCell<Integer> root, int level) {
        if (root != null) {
            printTree(root.getRight(), level + 1);
            for (int i = 0; i < level; i++)
                System.out.print("   ");
            System.out.println(root.getDatum());
            System.out.println();
            printTree(root.getLeft(), level + 1);
        }
    }

    /* You are to implement the methods below. You may often find that you need helper methods. These helper methods must be private methods that are either static or non-static. Static methods let you make calls to them without requiring any object creation.

    You must implement these methods using recursion (or making calls to other recursive methods).
     */

    // this method returns a boolean value indicating if this BSTInt contains a given integer x
    public boolean contains(Integer x) {
        // fill me in
        return contains(root,x);
    }

    private static boolean contains(TreeCell<Integer> root, Integer x){
        
        // System.out.println(root);
        // if(root.getLeft() == null && root.getRight() == null)
        if(root == null)
        {
            System.out.println("Do not contains anything");
            return false; 
        }
        else if(root.getDatum() == x)
        { 
            // System.out.println("Contain");
            return true;
        }
        else if(root.getDatum() > x) 
        {   
            return contains(root.getLeft(),x);
        }
        else if(root.getDatum() < x) 
        {
            return contains(root.getRight(),x);
        }
        return false; 
    }

    // this method returns the height of this BSTInt (the length of the longest path from the root to a node in this BSTInt)
    public int height() {
        // fill me in
        return height(root);
    }

    private static int height(TreeCell<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + Math.max( height(root.getLeft()) , height(root.getLeft()) );
       
    }


    // this method returns the largest integer in this BSTInt
    public int max() {
        // fill me in
        //return 0;
        return max(root);
    }
    private static int max(TreeCell<Integer> root)
    {
        int lastMax = 0;
        if(root == null)
        {   
            System.out.println("Tree is emtry");
            return 0;
        }
        else{
          
            int leftMax, rightMax;
            if(root.getLeft() != null)
            {   
                leftMax = max(root.getLeft());
                System.out.println(leftMax);
                lastMax = Math.max(lastMax,leftMax);
                
            }
            else if(root.getRight() != null)
            {   
                rightMax = max(root.getRight());
                lastMax = Math.max(lastMax,rightMax);
                // System.out.print(lastMax);
                
            }


        }
       
        return lastMax;
    }

    // this method returns the smallest integer in this BSTInt
    public int min() {
        // fill me in
        return 0;
    }
    
    // this method returns the number of integers in this BSTInt
    public int size() {
        // fill me in
        return 0;
    }    
}
