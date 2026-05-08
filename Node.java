package ex01;

public class Node {
    int empNumber;
    String empName;

    Node leftChild;
    Node rightChild;

    public Node(int empNumber, String empName) {
        this.empName = empName;
        this.empNumber = empNumber;


    }

    void displayNode() {
        System.out.println("Employee No: " + empNumber + ", empName: " + empName);
    }
}