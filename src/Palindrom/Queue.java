package Palindrom;

public class Queue {
    Node front;
    Node rear;
    int size;
    int count;

    public Queue(int size) {
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
        if (!isFull()) {
            Node node = new Node(letter);
            if (front == null) {
                front = node;
                rear = front;
                front.next = rear;
                count++;
            } else {
                rear.next = node;
                rear = node;
                count++;
            }
        } else {
            System.out.println("Queue dolu...");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char ch = front.letter;
            front = front.next;
            count--;
            return ch;
        } else {
            System.out.println("Queue boş...");
            return '*';
        }
    }
}
