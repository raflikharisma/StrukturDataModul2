package Modul3;

import java.util.LinkedList;
import java.util.Queue;

public class SecondExercise {
    public void queueExampple(){
        Queue baris = new LinkedList();
        baris.add("Java");
        baris.add("DotNet");
        baris.offer("PHP");
        baris.offer("HTML");
        System.out.println("remove : " + baris.remove());
        System.out.println("element : " + baris.element());
        System.out.println("poll : " + baris.poll());
        System.out.println("peek : " + baris.peek());
    }

    public static void main(String[] args) {
        new SecondExercise().queueExampple();
    }



}
