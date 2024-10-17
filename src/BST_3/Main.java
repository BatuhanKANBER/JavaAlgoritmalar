package BST_3;
// preOrder 10 - 8 - 5 - 9 - 15 - 12 - 20
// inOrder 5 - 8 - 9 - 10 - 12 - 15 - 20
// postOrder 5 - 9 - 8 - 12 - 20 - 15 - 10

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(8);
        bt.insert(15);
        bt.insert(5);
        bt.insert(12);
        bt.insert(20);
        bt.insert(9);

        System.out.println("root: " + bt.root.data);
        System.out.println("root sol: " + bt.root.left.data);
        System.out.println("root sağ: " + bt.root.right.data);
        System.out.println("root sol sol: " + bt.root.left.left.data);
        System.out.println("root sağ sol: " + bt.root.right.left.data);
        System.out.println("root sağ sağ: " + bt.root.right.right.data);
        System.out.println("root sol sağ: " + bt.root.left.right.data);

        System.out.println();

        System.out.print("preOrder: ");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.print("inOrder: ");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.print("postOrder: ");
        bt.postOrder(bt.root);
    }
}
