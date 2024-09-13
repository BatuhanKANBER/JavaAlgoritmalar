package LinkedList_1;

public class ListBuilder {
    private Node head = null;
    private Node tail = null;

    public void add(int x) {
        Node node = new Node();
        node.number = x;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
            System.out.println("Zincir oluşturuldu; head = " + head.number + " tail = " + tail.number);
        } else {
            tail.next = node;
            tail = node;
            System.out.println("Yeni düğüm eklendi; tail = " + tail.number);
        }
    }

    public void show() {
        if (head != null) {
            Node temp = head;
            System.out.print("start -> ");
            while (temp != null) {
                System.out.print(temp.number + " -> ");
                temp = temp.next;
            }
            System.out.println("end");
        } else {
            System.out.println("Gösterilebilecek bir zincir bulunamadı...:(");
        }
    }
}
