package Palindrom;

public class Stack {
    Node top;
    int size;
    int count;

    public Stack(int size) {
        this.size = size;
        count = 0;
    }

    private boolean isFull() {
        return (count == size);
    }

    private boolean isEmpty() {
        return (count == 0);
    }

    public void push(char letter) {
        Node node = new Node(letter);
        if (!isFull()) {
            if (top == null) {
                top = node;
                count++;
            } else {
                node.next = top;
                top = node;
                count++;
            }
        } else {
            System.out.println("Stack dolu...");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            count--;
            char ch = top.letter;
            top = top.next;
            return ch;
        } else {
            System.out.println("Stack boş...");
            return '*';
        }
    }
}
