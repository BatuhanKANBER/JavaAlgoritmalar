package Queue_1;

public class Queue {
    int[] array;
    int size;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
        front = 0;
        rear = -1;
    }

    private boolean isFull() {
        return (rear == size - 1);
    }

    private boolean isEmpty() {
        return (rear == -1);
    }

    public void enqueue(int x) {
        if (!isFull()) {
            array[++rear] = x;
            System.out.println(x + " kuyruğa eklendi...");
        } else {
            System.out.println("Kuyruk dolu...");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int temp = array[front];
            for (int i = 1; i <= rear; i++) {
                array[i - 1] = array[i];
            }
            rear--;
            System.out.println(temp + " kuyruktan çıkarıldı...");
        } else {
            System.out.println("Kuyruk boş...");
        }
    }

    public void show() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(array[i]);
            if (i == rear)
                break;
            System.out.print(" <= ");
        }
        System.out.println();
    }
}
