package ex02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner input = new Scanner(System.in);

        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(47, "Dinusha");
        tree.insert(66, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(34, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");


        System.out.println("----- InOrder Traversal -----");
        tree.inOrder();


        System.out.println("\n----- PreOrder Traversal -----");
        tree.preOrder();


        System.out.println("\n----- PostOrder Traversal -----");
        tree.postOrder();


        System.out.print("\nEnter employee number to search: ");
        int empNo = input.nextInt();

        Node found = tree.find(empNo);

        if (found != null) {
            System.out.println("Employee found:");
            found.displayNode();
        } else {
            System.out.println("Employee not found.");
        }


        System.out.println("\nDeleting all nodes...");
        tree.deleteAll();


        System.out.println("\n----- Tree After Deleting Nodes (InOrder) -----");
        tree.inOrder();

        input.close();
    }
}