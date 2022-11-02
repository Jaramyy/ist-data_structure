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
        st.printTree();
        System.out.println(st.contains(15));
        // System.out.println(st.height()); 
        // st.max();
        System.out.println(st.max());
        System.out.println(st.min()); 
        System.out.println(st.size());
        // BSTInt st2 = new BSTInt();
        // try {
        //     file = new File("input2.txt");
        //     scanner = new Scanner(file);
        //     while (scanner.hasNextInt()) {
        //         int key = scanner.nextInt();
        //         st2.insert(key);
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        // st2.printTree();
    }
}