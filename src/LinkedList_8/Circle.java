package LinkedList_8;

public class Circle {
    Person head;
    Person tail;

    public int size() {
        Person temp = head;
        int count = 0;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int index, String name) {
        Person person = new Person(name);
        if (head == null) {
            head = person;
            tail = head;
            tail.next = head;
            System.out.println("Çember oluşturuldu.");
        } else if (head != null && index == 0) {
            person.next = head;
            head = person;
            tail.next = head;
            System.out.println("Çemberin başı değiştirildi.");
        } else if (size() < index) {
            tail.next = person;
            person.next = head;
            tail = person;
            System.out.println("Çemberin sonu değiştirildi.");
        } else {
            Person next = head;
            int count = 0;
            while (count < index) {
                count++;
                next = next.next;
            }
            person.next = next;

            count = 1;
            Person prev = head;
            while (count < index) {
                count++;
                prev = prev.next;
            }
            prev.next = person;
            System.out.println("Çembere yeni kişi eklendi.");
        }
    }

    public void remove(int index) {
        if (head != null && index == 0) {
            tail.next = head.next;
            head = head.next;
            System.out.println("Çemberin başındki kişi kldırıldı.");
        } else if (size() <= index) {
            Person prev = head;
            int count = 1;
            while (count < size()) {
                count++;
                prev = prev.next;
            }
            prev.next = head;
            tail = prev;
            System.out.println("Çemberin sonundaki kişi kaldırıldı.");
        } else {
            Person prev = head;
            int count = 1;
            while (count < index) {
                count++;
                prev = prev.next;
            }
            prev.next = prev.next.next;
            System.out.println("Çemberden bir kişi kaldırıldı.");
        }
    }

    public void show() {
        Person temp = head;
        System.out.print("*" + temp.name + "*" + " -> ");
        do {
            temp = temp.next;
            System.out.print(temp.name + " -> ");
        } while (temp != tail);
        System.out.println("*" + temp.next.name + "*");
    }
}
