package Stack_2;
//Bağlı listelerle stack.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        System.out.println("Top: " + stack.top.number);
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.push(1);
        stack.push(2);
        System.out.println("Top: " + stack.top.number);
        stack.show();
    }
}
