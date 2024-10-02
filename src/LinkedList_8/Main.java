package LinkedList_8;
//Tek yönlü dairesel bağlı liste örnek
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.add(0, "Batuhan");
        circle.add(0, "Ali");
        circle.add(0, "Veli");
        circle.add(2, "Ahmet");
        circle.add(22, "Ece");
        //circle.add(2, "Ece");
        circle.show();
        circle.remove(0);
        circle.show();
        circle.remove(1);
        circle.show();
    }
}
