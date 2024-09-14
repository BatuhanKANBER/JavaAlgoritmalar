package LinkedList_3;
//Bağlı listede baştan sondan ve ortadan silme.
public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.add(1);
        listBuilder.add(2);
        listBuilder.add(3);
        listBuilder.add(4);
        listBuilder.add(5);
        listBuilder.add(6);
        listBuilder.add(7);
        listBuilder.show();
        listBuilder.removeTail();
        listBuilder.removeTail();
        listBuilder.removeTail();
        listBuilder.removeNode(0);
        listBuilder.removeNode(2);
        listBuilder.removeNode(1);
    }
}
