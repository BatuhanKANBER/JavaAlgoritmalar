package Palindrom;

import java.util.Scanner;

public class Main {
//    public static boolean isPalindrom(String len) {
//        char[] chars = len.toCharArray();
//        int lastIndex = chars.length;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != chars[--lastIndex]) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
//        if (isPalindrom("akadaka")){
//            System.out.println("Palindrom");
//        } else {
//            System.out.println("Palindrom deil");
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrom mu?");
        System.out.print("Kelimeyi gir: ");
        String len = scanner.nextLine();

        char[] chars = len.toCharArray();
        int size = chars.length;
        int count = 0;

        Stack stack = new Stack(size);
        Queue queue = new Queue(size);

        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
            queue.push(chars[i]);
        }

        for (int i = 0; i < chars.length; i++) {
            if (stack.pop() == queue.pop()) {
                count++;
            }
        }
        if (count == chars.length) {
            System.out.println("Kelime palindrom...");
        } else {
            System.out.println("Kelime palindrom değil...");
        }
    }
}
