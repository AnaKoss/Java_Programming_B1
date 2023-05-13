package day42_collection;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack <Character> stack = new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        //get whatever is on the TOP of the stack
        //top to bottom. d was the last which was putted inside
        System.out.println("Top of the stack: " + stack.peek());


        System.out.println("_________________");

        //remove the element at the top
        stack.pop();
        System.out.println(stack);
        System.out.println("Top of the stack: " + stack.peek());

        System.out.println("__________________");
        stack.pop();
        stack.pop();
        System.out.println("Top of the stack: " + stack.peek());

        System.out.println("___________________");
        //add new letter
        stack.push('z');
        System.out.println("Top of the stack: " + stack.peek()); //the last is putting inside ---> will be the first

        System.out.println("____________________");
        //can i remove the element from beginning
        //yes, you can BUT then we are Not FOLLOWING THE IDEA that is specific to STACK
        stack.remove(0);
        System.out.println("Top of the stack: " + stack.peek());


        System.out.println("____________________");
        stack.push('x');
        System.out.println("Top of the stack: " + stack.peek());

    }
}
