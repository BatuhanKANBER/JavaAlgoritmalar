package Node;
//Node oluşturma, değer atama, birleştirme

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        node1.number = 1;
        node2.number = 2;
        node3.number = 3;

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        Node temp = node1;
        while (temp != null) {
            System.out.println(temp.number);
            temp = temp.next;
        }
    }
}
