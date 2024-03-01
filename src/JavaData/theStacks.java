package JavaData;

import java.util.Stack;

public class theStacks {
    public static void main(String[] args) {
//last in first out
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("size");
        System.out.println(stack.size());//length
        System.out.println("read the element on the top");
        System.out.println(stack.peek());//the element on the top the last one added
        //in our case the top one is 30
        System.out.println("remove element");
        System.out.println(stack.pop());//remove the element in the top
        //in our case 30 is removed
        System.out.println(stack.size());
        System.out.println("empty or not");
        System.out.println(stack.empty());//boolena is empty or not
    }
}
