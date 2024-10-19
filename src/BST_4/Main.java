package BST_4;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(3);
        bt.insert(4);
        bt.insert(1);
        bt.insert(15);
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println("Size: " + bt.size());
    }
}
