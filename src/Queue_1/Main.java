package Queue_1;
//Kuyruk oluşturma, ekleme, çıkarma
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.enqueue(10);
        queue.enqueue(28);
        queue.enqueue(34);
        queue.show();
        queue.dequeue();
        queue.show();
    }
}
