package Examp_1;

//çift yönlü dairesel bağlı listelerde indexe göre veri ekleme  ve silme

public class Main {
    public static void main(String[] args) {
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.add(10, 1);
        listBuilder.add(11, 2);
        listBuilder.add(12, 3);
        listBuilder.add(13, 4);
        listBuilder.add(14, 2);
        listBuilder.add(15, 3);
        listBuilder.add(16, 1);
        System.out.println(listBuilder.size());
        listBuilder.show();
        listBuilder.remove(1);
        listBuilder.remove(0);
        listBuilder.remove(10);
        System.out.println(listBuilder.size());
        listBuilder.show();
    }
}
