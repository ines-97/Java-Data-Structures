package JavaData;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
//LinkedList->
        //->ListIterator
        LinkedList<person> people =new LinkedList<>();
        people.add(new person("ning",12));
        people.add(new person("ningning",22));
        people.addFirst(new person("lila",50));//added at the top
        people.addLast(new person("foufa",30));//added at the bottom
        System.out.println("return the linkedList by using forEach");
        people.forEach(System.out::println);



//use ListIterator without impelementing the interface with the methods of the Iterator

        System.out.println("return the linkedList using ListIterator");
        //call the iterator type <person> and use it withe poeple list that we already have
        ListIterator<person> iterators  = people.listIterator();//put the linkedList values in the Iterator

        // loop with ListIterator

        do {
            System.out.println(iterators.next());
        }while (iterators.hasNext());

        System.out.println("return the reversed linkedList using ListIterator");

        while(iterators.hasPrevious()){
            System.out.println(iterators.previous());
        }





        LinkedList<Integer> number =new LinkedList<>();


    }
        static record person(String name,int age){}
}
