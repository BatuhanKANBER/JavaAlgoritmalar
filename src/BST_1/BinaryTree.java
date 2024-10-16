package BST_1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    Node newRoot(int data) {
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newRoot(data);
        }
        return root;
    }
}
