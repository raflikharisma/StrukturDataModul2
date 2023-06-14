package Modul5;

import java.util.Scanner;

class Node {

    String StuffCode;
    String StuffName;
    Node left;
    Node right;

    public Node(String stuffCode, String stuffName) {
        this.StuffCode = stuffCode;
        this.StuffName = stuffName;
    }
}

class TreeInventory {
    public Node root;

    public void addData(String stuffCode, String stuffName) {
        Node newNode = new Node(stuffCode, stuffName);

        if (root != null) {
            insertNode(root, newNode);
        } else {
            root = newNode;
        }
    }

    private void insertNode(Node currentNode, Node newNode) {
        if (asciiValue(newNode.StuffCode) < asciiValue(currentNode.StuffCode)) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                insertNode(currentNode.left, newNode);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                insertNode(currentNode.right, newNode);
            }
        }
    }

    //ASCII VALUE
    private int asciiValue(String StuffCode) {
        int totalAscii = 0;

        for (int i = 0; i < StuffCode.length(); i++) {
            char ch = StuffCode.charAt(i);
            totalAscii += ch;
        }

        return totalAscii;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" (" + node.StuffCode + ")" + node.StuffName + " \t");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(" (" + node.StuffCode + ")" + node.StuffName + " \t");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" (" + node.StuffCode + ")" + node.StuffName + " \t");
        }
    }


}

/*Example Input Tree = B5, B6, A1, A4, B1, D9, E1*/

public class ModulPractice5 {
    public static void main(String[] args) {
        TreeInventory tree = new TreeInventory();
        Scanner inputSystem = new Scanner(System.in);
        int opt = 0;
        while (opt != 3) {
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.print("Your input : ");
            opt = inputSystem.nextInt();
            if (opt == 1) {
                inputSystem.nextLine();
                System.out.print("Masukkan code produk\t: ");
                String tempValue = inputSystem.nextLine();
                System.out.print("Masukkan nama barang\t: ");
                String tempName = inputSystem.nextLine();
                tree.addData(tempValue, tempName);
            } else if (opt == 2) {
                System.out.println("\nPre order\t: ");
                tree.preOrder(tree.root);
                System.out.println("\nIn order\t: ");
                tree.inOrder(tree.root);
                System.out.println("\nPost order\t: ");
                tree.postOrder(tree.root);
                System.out.println();
            }

        }


    }
}
