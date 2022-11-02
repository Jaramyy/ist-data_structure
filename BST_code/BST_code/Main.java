import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BSTInt st = new BSTInt();
        Scanner scanner;
        File file;
        try {
            file = new File("input1.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int key = scanner.nextInt();
                st.insert(key);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Original Tree");
        st.printTree();

        int val = 18;
        System.out.println("Contains value of" + val);
        System.out.println(st.contains(val));
        
        System.out.println("Height of tree");
        System.out.println(st.height()); 
        st.max();

        System.out.println("Maximum value of tree");
        System.out.println(st.max());

        System.out.println("Mininum value of tree");
        System.out.println(st.min()); 

        System.out.println("Size of tree");
        System.out.println(st.size());
        
        System.out.println("Delete integer");
        st.delete(12);
        st.printTree();

        System.out.println("Delete maximum ");
        st.deleteMax();
        st.printTree();

        System.out.println("Delete minimum ");
        st.deleteMin();
        st.printTree();

        System.out.println("Preorder");
        System.out.println(st.preorder());

        System.out.println("Postorder");
        System.out.println(st.postorder());



        BSTInt st2 = new BSTInt();
        try {
            file = new File("input2.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int key = scanner.nextInt();
                st2.insert(key);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // st2.printTree();


        System.out.println("Original Tree");
        st2.printTree();

        System.out.println("Contains value of " + val);
        System.out.println(st2.contains(val));
        
        System.out.println("Height of tree");
        System.out.println(st2.height()); 

        System.out.println("Maximum value of tree");
        System.out.println(st2.max());

        System.out.println("Mininum value of tree");
        System.out.println(st2.min()); 

        System.out.println("Size of tree");
        System.out.println(st2.size());
        
        System.out.println("Delete integer");
        st2.delete(12);
        st2.printTree();

        System.out.println("Delete maximum ");
        st2.deleteMax();
        st2.printTree();

        System.out.println("Delete minimum ");
        st2.deleteMin();
        st2.printTree();

        System.out.println("Preorder");
        System.out.println(st2.preorder());

        System.out.println("Postorder");
        System.out.println(st2.postorder());
    }
}