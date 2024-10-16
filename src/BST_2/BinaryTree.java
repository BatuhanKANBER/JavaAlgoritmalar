package BST_2;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (root != null) {
            Node temp = root;
            while (true) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = node;
                        System.out.println(node.data + " ağaca eklendi.");
                        break;
                    } else
                        temp = temp.left;
                } else {
                    if (temp.right == null) {
                        temp.right = node;
                        System.out.println(node.data + " ağaca eklendi.");
                        break;
                    } else
                        temp = temp.right;
                }
            }
        } else {
            root = node;
            System.out.println(node.data + " ağaca root olarak eklendi.");
        }
    }
}
