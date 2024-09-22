package LinkedList_6;

import java.util.Scanner;

public class ClientManager {
    private Client head = null;
    private Client tail = null;
    private Scanner scanner = new Scanner(System.in);
    private int number;
    private String name;

    public int checkNumber(Client client) {
        Client temp = head;
        while (temp != null) {
            if (temp.number == client.number)
                return temp.number;
            temp = temp.next;
        }
        return -1;
    }

    public void creater() {
        System.out.println("Numara Giriniz: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad Giriniz: ");
        name = scanner.nextLine();
    }

    public void add(int index) {
        creater();
        Client client = new Client(number, name);
        if (head == null) {
            head = client;
            tail = head;
            System.out.println("İlk müşteri girişi sağlandı.");
        } else if (head != null && index == 0) {
            int check = checkNumber(client);
            if (check == client.number) {
                System.out.println("Aynı numara birden fazla müşteriye atanamaz!");
            } else {
                client.next = head;
                head.prev = client;
                head = client;
                System.out.println("İlk sıradaki müşteri " + client.name + " olarak değiştirildi.");
            }
        } else {
            int check = checkNumber(client);
            if (check == client.number) {
                System.out.println("Aynı numara birden fazla müşteriye atanamaz!");
            } else {
                int size = 0;
                Client temp = head;
                while (temp != null) {
                    size++;
                    temp = temp.next;
                }
                if (size < index) {
                    tail.next = client;
                    client.prev = tail;
                    tail = client;
                    System.out.println("Son sıradaki müşteri " + client.name + " olarak değiştirildi.");
                } else {
                    Client prev = head;
                    Client next = head;
                    int count = 0;
                    while (count < index - 1) {
                        count++;
                        prev = prev.next;
                    }
                    prev.next = client;
                    client.prev = prev;
                    while (count < index) {
                        count++;
                        next = next.next;
                    }
                    next.prev = client;
                    client.next = next;
                    System.out.println(client.name + " adlı müşteri eklendi.");
                }
            }
        }
    }

    public void remove(int x) {
        if (head.number == x) {
            head = head.next;
            head.prev = null;
            System.out.println("İlk sıradaki müşteri silindi.");
        } else if (tail.number == x) {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Son sıradaki müşteri silindi.");
        } else {
            Client temp = head;
            while (temp != null) {
                if (x == temp.number) {
                    break;
                }
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println(x + " numaralı müşteri silindi.");
        }
    }

    public void show() {
        Client tempHead = head;
        System.out.print("Start => ");
        while (tempHead != null) {
            System.out.print(tempHead.number + " numara " + tempHead.name + " => ");
            tempHead = tempHead.next;
        }
        System.out.println(" End.");

        Client tempTail = tail;
        System.out.print("Son => ");
        while (tempTail != null) {
            System.out.print(tempTail.number + " numara " + tempTail.name + " => ");
            tempTail = tempTail.prev;
        }
        System.out.println(" Start.");
    }
}
