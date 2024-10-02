package LinkedList_6;
//İki yönlü doğrusal bağlı liste örnek

public class Main {
    public static void main(String[] args) {
        ClientManager clientManager = new ClientManager();
        clientManager.add(0);
        clientManager.add(0);
        clientManager.add(0);
        clientManager.add(10);
        clientManager.remove(3);
        clientManager.remove(4);
        clientManager.show();
    }
}
