package BST_2;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(15);
        bt.insert(8);
        bt.insert(4);
        bt.insert(12);
        bt.insert(20);
        System.out.println("root: " + bt.root.data);
        System.out.println("root sağ: " + bt.root.right.data);
        System.out.println("root sol: " + bt.root.left.data);
        System.out.println("root sol-sol: " + bt.root.left.left.data);
        System.out.println("root sağ-sol: " + bt.root.right.left.data);
        System.out.println("root sağ-sağ: " + bt.root.right.right.data);


    }
}
