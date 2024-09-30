package LinkedList_9;

public class ListBuilder {
    Node head;
    Node tail;

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int index, int x) {
        Node node = new Node();
        node.number = x;
        if (head == null) {
            head = node;
            tail = head;
            head.next = tail;
            head.prev = tail;
            tail.next = head;
            tail.prev = head;
            System.out.println("İlk düğüm oluşturuldu.");
        } else if (head != null && index == 0) {
            head.prev = node;
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head = node;
            System.out.println("İlk düğüm değiştirildi.");
        } else if (size() <= index) {
            tail.next = node;
            head.prev = node;
            node.prev = tail;
            node.next = head;
            tail = node;
            System.out.println("Son düğüm değiştirildi.");
        } else {
            Node next = head;
            int count = 0;
            while (count < index) {
                count++;
                next = next.next;
            }
            next.prev = node;
            node.next = next;

            count = 1;
            Node prev = head;
            while (count < index) {
                count++;
                prev = prev.next;
            }
            node.prev = prev;
            prev.next = node;
            System.out.println("Yeni düğüm eklendi.");
        }
    }

    public void remove(int index) {
        if (head != null && index == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            System.out.println("İlk düğüm kaldırıldı.");
        } else if (size() <= index) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            System.out.println("Son düğüm kaldırıldı.");
        } else {
            Node temp = head;
            int count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println("Düğüm kaldırıldı.");
        }
    }

    public void show() {
        Node temp1 = head;
        while (temp1.next != head) {
            System.out.print(temp1.number + " -> ");
            temp1 = temp1.next;
        }
        System.out.println(temp1.number + " -> *" + temp1.next.number + "*");

        Node temp2 = head;
        while (temp2.prev != head) {
            System.out.print(temp2.number + " -> ");
            temp2 = temp2.prev;
        }
        System.out.println(temp2.number + " -> *" + temp2.prev.number + "*");
    }
}
