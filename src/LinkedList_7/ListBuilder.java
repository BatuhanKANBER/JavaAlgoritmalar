package LinkedList_7;

public class ListBuilder {
    Node head;
    Node tail;

    public void add(int index, int x) {
        Node node = new Node();
        node.number = x;
        if (head == null) {
            head = node;
            tail = head;
            tail.next = head;
            System.out.println("Liste oluşturuldu.");
        } else if (head != null && index == 0) {
            node.next = head;
            head = node;
            tail.next = head;
            System.out.println("Head " + node.number + " olarak değiştirildi.");
        } else {
            Node temp = head;
            int count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
                if (temp == tail) {
                    break;
                }
            }
            if (temp == tail) {
                tail.next = node;
                node.next = head;
                tail = node;
                System.out.println("Tail " + node.number + " olarak değiştirildi.");
            } else {
                count = 1;
                Node prev = head;
                while (count < index) {
                    count++;
                    prev = prev.next;
                }
                prev.next = node;
                node.next = temp;
                System.out.println(index + ". index " + node.number + " olarak değiştirildi.");
            }
        }
    }

    public void show() {
        Node temp = head;
        System.out.print("Start -> ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("*" + temp.number + "* -> end.");
    }
}
