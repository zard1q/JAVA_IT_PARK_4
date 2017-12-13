package ru.itpark;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        Random random =  new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            tree.add(number);
            System.out.print(number+" ");
        }
        System.out.println();
        tree.PreOrderTraversal();
        System.out.println();
        tree.PostOrderTraversal();
        System.out.println();
        tree.InOrderTraversal();


	// write your code here
    }
}
