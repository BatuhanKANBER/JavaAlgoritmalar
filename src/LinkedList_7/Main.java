package LinkedList_7;
//Tek yönlü dairesel bağlı liste ekleme

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.add(0,3);
        listBuilder.add(0,2);
        listBuilder.add(0,1);
        listBuilder.add(0,28);
        listBuilder.add(3,100);
        listBuilder.add(1,50);
        listBuilder.add(3,200);
        listBuilder.add(100,900);
        listBuilder.show();
    }
}
