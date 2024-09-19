package LinkedList_5;

//İki yönlü doğrusal bağlı listede baştan, sondan, ortadan ekleme ve silme
public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.addHead(1);
        listBuilder.addHead(2);
        listBuilder.addHead(3);
        listBuilder.addTail(4);
        listBuilder.addTail(5);
        listBuilder.addTail(6);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.addToIndex(2, 28);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.addToIndex(0, 31);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.addToIndex(8, 100);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.remove(0);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.remove(10);
        listBuilder.showByHead();
        listBuilder.showByTail();
        listBuilder.remove(3);
        listBuilder.showByTail();
        listBuilder.showByHead();
        listBuilder.remove(2);
        listBuilder.showByTail();
        listBuilder.showByHead();
    }
}
