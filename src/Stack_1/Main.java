package Stack_1;
//Stacklerde ekleme ve çıkarma.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("pop(): "+ stack.pop());
        System.out.println("pop(): "+ stack.pop());
        System.out.println("pop(): "+ stack.pop());
        System.out.println("pop(): "+ stack.pop());
        System.out.println("pop(): "+ stack.pop());
        System.out.println("pop(): "+ stack.pop());
    }
}
