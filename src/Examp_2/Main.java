package Examp_2;

//İkili arama ağacında pre order, in order, post order dolaşma ve düğüm ekleme

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(3);
        binaryTree.insert(6);
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(67);
        binaryTree.insert(8);

        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
    }
}
