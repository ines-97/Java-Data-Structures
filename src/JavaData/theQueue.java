package JavaData;

import java.util.LinkedList;
import java.util.Queue;

public class theQueue {
    public static void main(String[] args) {
//first element added first removed
        Queue<String> colors = new LinkedList<>();
        colors.add("green");
        colors.add("orange");
        colors.add("white");

        System.out.println("size");
        System.out.println(colors.size());
        System.out.println("return first element");
        System.out.println(colors.peek());//return first element
        System.out.println("remove the first element");
        System.out.println(colors.poll());
        System.out.println(colors.size());
        System.out.println(colors.peek());
    }

}
