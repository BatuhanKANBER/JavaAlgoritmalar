package LinkedList_2;
//Bağlı listenin başına, sonuna ve arasına eleman ekleme

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.show();
        listBuilder.addStart(1);
        listBuilder.addStart(2);
        //listBuilder.addStart(0);
        listBuilder.addEnd(3);
        //listBuilder.addEnd(4);
        listBuilder.addAmong(1,28);
        listBuilder.addAmong(2,28);
        listBuilder.addAmong(4,34);
        listBuilder.addAmong(0,31);
        listBuilder.show();
        System.out.println("Zincirin başı: " + listBuilder.head.number);
        System.out.println("Zincirin sonu: " + listBuilder.tail.number);
    }
}
