package LinkedList_2;
//Bağlı listenin başına ve sonuna eleman ekleme

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.show();
        listBuilder.addStart(1);
        listBuilder.addStart(2);
        //listBuilder.addStart(0);
        listBuilder.addEnd(3);
        //listBuilder.addEnd(4);
        listBuilder.show();
        System.out.println("Zincirin başı: " + listBuilder.head.number);
        System.out.println("Zincirin sonu: " + listBuilder.tail.number);
    }
}
