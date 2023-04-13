package Modul3;

import java.util.Stack;

public class FisrtExercise {
    public static void main(String[] args) {

        Stack <String> stack = new Stack<>();

        stack.push("Rafli");
        stack.push("Kharisma");
        stack.push("AKbar");
        System.out.println(stack);
        int search = stack.search("Kharisma");

        while (search != -1 && search > 1){
            stack.pop();
            search--;
        }

        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
