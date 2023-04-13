package Modul3;

class Stack{
    private int maxSize;
    private long[] stackArray;
    private int top;


    public Stack (int a){
        maxSize = a;
        stackArray = new long[maxSize];
        top= -1;
    }
    public void push(long data){
        stackArray[++top] = data;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }

}


public class withoutLibraStack {
    public static void main(String[] args) {
    Stack theStack = new Stack(10);
    theStack.push(20);
    theStack.push(100);
    theStack.push(200);

    System.out.println(theStack.peek());
    System.out.println(theStack.pop());
    System.out.println(theStack.pop());
    System.out.println("Apakah stack kosong : " + theStack.isEmpty());

    }
}
