package src.AllCoding.AllCoding;


import java.util.Stack;

public class UseOfStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("NY");
        stack.push("NJ");
        stack.push("CT");

        //System.out.println(stack.peek());
        if(stack.peek().equalsIgnoreCase("CT")){
            System.out.println(stack.pop());
        }

    }
}
