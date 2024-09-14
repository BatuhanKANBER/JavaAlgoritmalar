package LinkedList_3;

public class ListBuilder {
    Node head = null;
    Node tail = null;

    public void add(int x) {
        Node node = new Node();
        node.number = x;
        node.next = null;
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void show() {
        Node temp = head;
        System.out.print("start -> ");
        while (temp != null) {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void removeHead() {
        if (head == null) {
            System.out.println("Zincir bulunamadı.");
        } else {
            head = head.next;
            System.out.println("Head silindi yeni head = " + head.number);
            show();
        }
    }

    public void removeTail() {
        if (head == null) {
            System.out.println("Zincir bulunamadı.");
        } else {
            Node temp = head;
            Node newTail = head;
            while (temp.next != null) {
                newTail = temp;
                temp = temp.next;
            }
            newTail.next = null;
            System.out.println("Tail silindi yeni tail = " + newTail.number);
            show();
        }
    }

    public void removeNode(int index) {
        if (index == 0) {
            head = head.next;
            System.out.println("Head silindi yeni head = " + head.number);
            show();
        } else {
            int count = 0;
            Node temp = head;
            Node newConnecter = null;
            while (count != index) {
                count++;
                newConnecter = temp;
                temp = temp.next;
            }
            newConnecter.next = temp.next;
            if (newConnecter.next == null) {
                tail = newConnecter;
                System.out.println("Tail silindi yeni tail = " + tail.number);
            }
            System.out.println(index + ". indisteki düğüm silindi.");
            show();
        }
    }
}
