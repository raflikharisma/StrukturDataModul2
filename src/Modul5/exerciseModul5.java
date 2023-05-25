package Modul5;

class Nodee {
    int data;
    Nodee left;
    Nodee right;

    public Nodee(int data) {
        this.data = data;
    }
}

class BinaryTree {
    public Nodee root;

    public void NewNode(int data) {
        root = NewNode(root, new Nodee(data));
    }

    private Nodee NewNode(Nodee root, Nodee newData) {
        if (root == null) {
            root = newData;
            return root;
        }
        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        } else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Nodee node) {
        if (node != null) {

            inOrder(node.left);

            System.out.print(node.data + " ");

            inOrder(node.right);
        }
    }

    public void preOrder(Nodee node) {
        if (node != null) {

            System.out.print(node.data + " ");

            preOrder(node.left);

            preOrder(node.right);
        }
    }

    public void postOrder(Nodee node) {
        if (node != null) {
            // Traverse the left subtree
            postOrder(node.left);

            // Traverse the right subtree
            postOrder(node.right);

            // Process the current node
            System.out.print(node.data + " ");
        }
    }
}


public class exerciseModul5 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        //calling object
        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        //method traversal
        System.out.println("\nPre order : ");
        tree.preOrder(tree.root);
        System.out.println("\nIn order : ");
        tree.inOrder(tree.root);
        System.out.println("\nPost order : ");
        tree.postOrder(tree.root);
    }
}
