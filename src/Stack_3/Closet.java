package Stack_3;

public class Closet {
    Blaket top;
    int size;
    int count;

    public Closet(int size) {
        this.size = size;
        count = 0;
    }

    private boolean isEmpty() {
        return (count == 0);
    }

    private boolean isFull() {
        return (count == size);
    }

    public void push(String colorName) {
        if (!isFull()) {
            Blaket blaket = new Blaket(colorName);
            if (top == null) {
                top = blaket;
                count++;
                System.out.println("Yüklüğe ilk olarak " + top.color + " battaniye eklendi...");
            } else {
                count++;
                blaket.prev = top;
                top = blaket;
                System.out.println("Yüklüğe " + top.color + " battaniye eklendi...");
            }
        } else {
            System.out.println("Yüklükte yer kalmadı...");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            count--;
            System.out.println(top.color + " battaniye yüklükten alındı...");
            top = top.prev;
        } else {
            System.out.println("Yüklük zaten boş...");
        }
    }

    public void show() {
        Blaket temp = top;
        System.out.println("*******************************");
        while (temp != null) {
            System.out.println("- " + temp.color + " battaniye -");
            temp = temp.prev;
        }
        System.out.println("*******************************");
    }
}
