package LinkedList_10;

//İki yönlü dairesel bağlı liste örnek
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.add(0, "28ABC28");
        parking.add(0, "34ABC34");
        parking.add(0, "41ABC41");
        parking.add(1, "31ABC31");
        parking.add(3, "44ABC44");
        parking.add(10, "61ABC61");
        parking.show();
        parking.remove(0);
        parking.remove(4);
        parking.remove(1);
        parking.show();
    }
}
