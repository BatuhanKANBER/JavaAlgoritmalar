package LinkedList_2;

public class ListBuilder {
    Node head = null;
    Node tail = null;

//    public void add(int x) {
//        Node node = new Node();
//        node.number = x;
//        node.next = null;
//        if (head == null) {
//            head = node;
//            tail = head;
//            System.out.println("Zincir oluşturuldu; head = " + head.number + " tail = " + tail.number);
//        } else {
//            tail.next = node;
//            tail = node;
//            System.out.println("Zincire yeni düğüm eklendi; tail = " + tail.number);
//        }
//    }

    public void addStart(int x) {
        Node node = new Node();
        node.number = x;
        node.next = null;
        if (head == null) {
            head = node;
            tail = head;
            System.out.println("Zincir oluşturuldu; head = " + head.number + " tail = " + tail.number);
        } else {
            node.next = head;
            head = node;
            System.out.println("Zincirin başlangıcı değiştirildi; head = " + head.number);
        }
    }

    public void addEnd(int x) {
        Node node = new Node();
        node.number = x;
        node.next = null;
        if (head == null) {
            head = node;
            tail = head;
            System.out.println("Zincir oluşturuldu; head = " + head.number + " tail = " + tail.number);
        } else {
            tail.next = node;
            tail = node;
            System.out.println("Zincirin sonuna yeni eleman eklendi; tail = " + tail.number);
        }
    }

    public void addAmong(int index, int x) {
        int count = 0;
        Node first = head;
        while (count != index) { //İSTENİLEN İNDİSE GİT
            first = first.next;
            count++;
        }
        Node second = head;
        count = 0;
        while (count != index + 1) { //EKLENEN DÜĞÜMÜN NEXTINE GİT
            second = second.next;
            count++;
        }
        Node node = new Node();
        node.number = x;
        first.next = node;
        node.next = second;
        if (second == null){
            tail = node;
        }
    }

    public void show() {
        if (head == null) {
            System.out.println("Oluşturulmuş bir zincir bulunamadı");
        } else {
            Node temp = head;
            System.out.print("Start -> ");
            while (temp != null) {
                System.out.print(temp.number + " -> ");
                temp = temp.next;
            }
            System.out.println("End.");
        }
    }
}
