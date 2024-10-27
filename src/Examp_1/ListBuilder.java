package Examp_1;

public class ListBuilder {
    Node head;
    Node tail;
    private int count;

    public int size() {
        Node temp = head;
        count = 1;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int data, int index) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            head.next = tail;
            tail.next = head;
            head.prev = tail;
            tail.prev = head;
        } else if (head != null && index == 0) {
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
            head = node;
            System.out.println("new head : " + head.data);
        } else if (index >= size()) {
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
            tail = node;
            System.out.println("new tail : " + tail.data);
        } else {
            Node temp = head;
            count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            temp.prev.next = node;
            node.prev = temp.prev;
            node.next = temp;
            temp.prev = node;
            System.out.println("new node : " + node.data);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else if (index >= size()) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        } else {
            Node temp = head;
            count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void show() {
        Node temp1 = head;
        System.out.print("head to tail -> ");
        while (temp1.next != head) {
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next;
        }
        System.out.println(temp1.data + " -> end.");

        Node temp2 = tail;
        System.out.print("tail to head -> ");
        while (temp2.prev != tail) {
            System.out.print(temp2.data + " -> ");
            temp2 = temp2.prev;
        }
        System.out.println(temp2.data + " -> end.");
    }
}
