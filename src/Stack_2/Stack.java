package Stack_2;

import java.io.OutputStream;

public class Stack {
    Node top;
    int size;
    int count;

    public Stack(int size) {
        this.size = size;
        count = 0;
        System.out.println(size + " boyutlu stack oluşturuldu...");
    }

    public void push(int x) {
        Node node = new Node();
        node.number = x;
        node.prev = null;
        if (count < size) {
            if (top == null) {
                count++;
                top = node;
                System.out.println("İlk düğün eklendi...");
                System.out.println("push(): " + node.number);
            } else {
                count++;
                node.prev = top;
                top = node;
                System.out.println("push(): " + node.number);
            }
        } else {
            System.out.println("Stack dolu...");
        }
    }

    public void pop() {
        if (top != null) {
            System.out.println("pop(): " + top.number);
            top = top.prev;
            count--;
        } else {
            System.out.println("Stack boş...");
        }
    }

    public void show() {
        Node temp = top;
        System.out.println("***************Stack***************");
        while (temp != null) {
            System.out.println("-" + temp.number + "-");
            temp = temp.prev;
        }
        System.out.println("***********************************");
    }
}
