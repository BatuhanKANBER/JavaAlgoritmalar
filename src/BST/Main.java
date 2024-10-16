package BST;

//İkili arama ağacı
//      10
//     /  \
//    8   15
//   /   /  \
//  4   12   20

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.insert(binaryTree.root, 10);
        binaryTree.root = binaryTree.insert(binaryTree.root, 15);
        binaryTree.root = binaryTree.insert(binaryTree.root, 8);
        binaryTree.root = binaryTree.insert(binaryTree.root, 4);
        binaryTree.root = binaryTree.insert(binaryTree.root, 12);
        binaryTree.root = binaryTree.insert(binaryTree.root, 20);
        System.out.println("root: " + binaryTree.root.data);
        System.out.println("root sağ: " + binaryTree.root.right.data);
        System.out.println("root sol: " + binaryTree.root.left.data);
        System.out.println("root sol-sol: " + binaryTree.root.left.left.data);
        System.out.println("root sağ-sol: " + binaryTree.root.right.left.data);
        System.out.println("root sağ-sağ: " + binaryTree.root.right.right.data);

    }
}
