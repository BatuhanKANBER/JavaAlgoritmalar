package BST_4;

public class BinaryTree {
    Node root;
    int count;

    public BinaryTree() {
        root = null;
        count = 0;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (root != null) {
            Node temp = root;
            while (true) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = node;
                        count++;
                        return;
                    } else
                        temp = temp.left;
                } else {
                    if (temp.right == null) {
                        temp.right = node;
                        count++;
                        return;
                    } else
                        temp = temp.right;
                }
            }
        } else {
            root = node;
            count++;
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int size() {
        if (root != null)
            return count;
        else {
            count = 0;
            return 0;
        }
    }
}
