package Queue_2;

public class Queue {
    int size;
    int count;
    Node front;
    Node rear;

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

    public void enqueue(int x) {
        Node node = new Node(x);
        if (!isFull()) {
            if (front == null) {
                front = node;
                rear = front;
                front.next = rear;
                count++;
                System.out.println(front.number + " kuyruğun ilk elemanı olarak eklendi...");
            } else {
                rear.next = node;
                rear = node;
                count++;
                System.out.println(rear.number + " kuyruğa eklendi...");
            }
        } else {
            System.out.println("Kuyruk dolu...");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            Node temp = front;
            front = front.next;
            count--;
            System.out.println(temp.number + " kuyruktan çıkarıldı...");
        } else {
            System.out.println("Kuyruk boş...");
        }
    }

    public void show() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.number);
            temp = temp.next;
            if (temp == null)
                break;
            System.out.print(" <= ");
        }
        System.out.println();
    }
}
