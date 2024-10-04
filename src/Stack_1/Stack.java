package Stack_1;

public class Stack {
    int[] array;
    int size;
    int index;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
        index = -1;
    }

    public void push(int data) {
        if (!isFull()) {
            index++;
            array[index] = data;
            System.out.println("push(): " + array[index]);
        } else {
            System.out.println("Stack dolu!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return array[index--];
        } else {
            System.out.println("Stack boş!");
            return -1;
        }
    }
    private boolean isFull(){
        return (index == size-1);
    }
    private boolean isEmpty(){
        return (index == -1);
    }

}
