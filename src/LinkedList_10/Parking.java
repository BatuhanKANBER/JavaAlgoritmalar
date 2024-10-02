package LinkedList_10;

public class Parking {
    Car head;
    Car tail;

    public int size() {
        int count = 0;
        Car temp = head;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int index, String plate) {
        Car car = new Car(plate);
        if (head == null) {
            head = car;
            tail = head;
            head.next = tail;
            head.prev = tail;
            tail.next = head;
            tail.prev = head;
            System.out.println("İlk araç park etti...");
        } else if (head != null && index == 0) {
            head.prev = car;
            car.next = head;
            car.prev = tail;
            tail.next = car;
            head = car;
            System.out.println("İlk sıraya başka bir araç park etti...");
        } else if (size() < index) {
            tail.next = car;
            head.prev = car;
            car.next = head;
            car.prev = tail;
            tail = car;
            System.out.println("Son sıraya başka bir araç park etti...");
        } else {
            Car temp = head;
            int count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            car.next = temp;
            car.prev = temp.prev;
            temp.prev.next = car;
            temp.prev = car;
            System.out.println(index + ". sıraya başka bir araç park etti...");
        }
    }

    public void remove(int index) {
        if (head != null && index == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            System.out.println("İlk sıradaki araç parktan ayrıldı...");
        } else if (size() <= index) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            System.out.println("Son sıradaki araç parktan ayrıldı...");
        } else {
            Car temp = head;
            int count = 0;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println(index + ". sıradaki araç parktan ayrıldı...");
        }
    }

    public void show() {
        Car temp = head;
        while (temp.next != head) {
            System.out.print(temp.plate + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.plate + " -> *" + temp.next.plate);
        System.out.println("********************************");
        while (temp.prev != tail) {
            System.out.print(temp.plate + " -> ");
            temp = temp.prev;
        }
        System.out.println(temp.plate + " -> *" + temp.prev.plate);
    }
}
