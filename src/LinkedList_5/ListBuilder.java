package LinkedList_5;

public class ListBuilder {
    Node head = null;
    Node tail = null;

    public void addHead(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addTail(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void addToIndex(int index, int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            tail = head;
        } else if (head != null && index == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        } else {
            Node temp = head;
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            if (index >= size) {
                tail.next = node;
                node.prev = tail;
                tail = node;
            } else {
                Node nextNode = head;

                int count = 0;
                while (count < index) {
                    count++;
                    nextNode = nextNode.next;
                }
                nextNode.prev = node;
                node.next = nextNode;

                Node prevNode = head;
                count = 1;
                while (count < index) {
                    count++;
                    prevNode = prevNode.next;
                }
                prevNode.next = node;
                node.prev = prevNode;
            }
        }
    }

    public void showByHead() {
        Node tempHead = head;
        System.out.print("Head ->");
        while (tempHead != null) {
            System.out.print(tempHead.number + "->");
            tempHead = tempHead.next;
        }
        System.out.println(" tail.");
    }

    public void remove(int index) {
        if (head != null && index == 0) {
            head = head.next;
            head.prev = null;
        } else {
            Node temp = head;
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            if (index >= size) {
                tail = tail.prev;
                tail.next = null;
            } else {
                Node prevNode = head;
                int count = 1;
                while (count < index) {
                    count++;
                    prevNode = prevNode.next;
                }
                count = 0;
                Node nextNode = head;
                while (count <= index) {
                    count++;
                    nextNode = nextNode.next;
                }
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
            }
        }
    }

    public void showByTail() {
        Node tempTail = tail;
        System.out.print("Tail ->");
        while (tempTail != null) {
            System.out.print(tempTail.number + "->");
            tempTail = tempTail.prev;
        }
        System.out.println(" head.");
    }
}
