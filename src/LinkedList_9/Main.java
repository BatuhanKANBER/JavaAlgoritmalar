package LinkedList_9;

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.add(0, 5);
        listBuilder.show();
        listBuilder.add(0, 4);
        listBuilder.add(0, 3);
        listBuilder.add(0, 2);
        listBuilder.add(0, 1);
        listBuilder.add(2,10);
        listBuilder.add(100,100);
        listBuilder.remove(100);
        listBuilder.remove(2);
        listBuilder.remove(0);
        listBuilder.show();
    }
}
