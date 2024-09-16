package LinkedList_4;

import java.util.Scanner;

public class TeamBuilder {
    private Player head;
    private Player tail;
    private int number;
    private String fullName;
    private String position;
    private int goals;
    private int assists;
    private Scanner scanner = new Scanner(System.in);

    public void creater() {
        System.out.println("Futbolcu Numara: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Futbolcu Tam Adı: ");
        fullName = scanner.nextLine();
        System.out.println("Futbolcu Pozisyonu: ");
        position = scanner.nextLine();
        System.out.println("Futbolcu Gol Sayısı: ");
        goals = scanner.nextInt();
        System.out.println("Futbolcu Asist Sayısı: ");
        assists = scanner.nextInt();
    }

    public void addStart() {
        creater();
        Player player = new Player(number, fullName, position, goals, assists);
        player.next = null;
        if (head == null) {
            head = player;
            tail = head;
            System.out.println("Takım oluşturuluyor...");
            System.out.println("İlk oyuncu eklendi...");
            System.out.println("İlk sıradaki oyuncu: " + head.number + " forma numarasıyla " + head.fullName);
        } else {
            Player temp = head;
            while (temp.next != null) {
                if (player.number == temp.number) {
                    break;
                }
                temp = temp.next;
            }
            if (player.number != temp.number) {
                player.next = head;
                head = player;
                System.out.println("İlk sıradaki oyuncu: " + head.number + " forma numarasıyla " + head.fullName + " olarak değiştirldi.");
            } else {
                System.out.println("Aynı sırt numarası iki farklı oyuncuya verilemez.");
            }
        }
    }

    public void addEnd() {
        creater();
        Player player = new Player(number, fullName, position, goals, assists);
        player.next = null;
        if (head == null) {
            head = player;
            tail = head;
            System.out.println("Takım oluşturuluyor...");
            System.out.println("İlk oyuncu eklendi...");
            System.out.println("İlk sıradaki oyuncu: " + head.number + " forma numarasıyla " + head.fullName);
        } else {
            Player temp = head;
            while (temp.next != null) {
                if (player.number == temp.number) {
                    break;
                }
                temp = temp.next;
            }
            if (player.number != temp.number) {
                tail.next = player;
                tail = player;
                System.out.println(tail.number + " forma numarasıyla " + tail.fullName + " son sıraya eklendi.");
            } else {
                System.out.println("Aynı sırt numarası iki farklı oyuncuya verilemez.");
            }
        }
    }

    public void addForIndex(int index) {
        creater();
        Player player = new Player(number, fullName, position, goals, assists);
        player.next = null;
        if (head == null) {
            head = player;
            tail = head;
            System.out.println("Takım oluşturuluyor...");
            System.out.println("İlk oyuncu eklendi...");
            System.out.println("İlk sıradaki oyuncu: " + head.number + " forma numarasıyla " + head.fullName);
        } else if (head != null && index == 0) {
            player.next = head;
            head = player;
        } else {
            Player temp = head;
            while (temp.next != null) {
                if (player.number == temp.number) {
                    break;
                }
                temp = temp.next;
            }
            if (player.number != temp.number) {
                Player nextPlayer = head;
                int count = 0;
                while (count < index) {
                    nextPlayer = nextPlayer.next;
                    count++;
                }
                player.next = nextPlayer;
                Player beforePlayer = head;
                count = 1;
                while (count < index) {
                    beforePlayer = beforePlayer.next;
                    count++;
                }
                beforePlayer.next = player;
                if (player.next == null) {
                    tail = player;
                    System.out.println(tail.number + " forma numarasıyla " + tail.fullName + " son sıraya eklendi.");
                } else {
                    System.out.println(player.number + " forma numarasıyla " + player.fullName + " " + index + ". indexe eklendi.");
                }
            } else {
                System.out.println("Aynı sırt numarası iki farklı oyuncuya verilemez.");
            }
        }
    }

    public void show() {
        Player temp = head;
        System.out.println("FORMA NUMARASI | TAM ADI | POZİSYON | GOL SAYISI | ASİST SAYISI | G/A KATKISI");
        while (temp != null) {
            System.out.println(temp.number + " | " + temp.fullName + " | " + temp.position + " | " + temp.goals + " | " + temp.assists + " | " + temp.cont);
            temp = temp.next;
        }
    }
}
