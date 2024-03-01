package JavaData;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class theList {
    public static void main(String[] args) {
//add all type of data in list

        //List accept douplicates
        List color= new ArrayList();
        color.add("blue");
        color.add(1);
        color.add(new Object());
        color.add("blue");
//specify the type of the list
        //List of String only
        List<String> people=List.of("yellow","pink");
        people.forEach(System.out::println);

        List<String> Color=new ArrayList<String>();
        Color.add("yellow");
        Color.add("blue");
        Color.add("purple");
        Color.add("pink");
        Color.add("blue");
        Color.add("pink");
        System.out.println(Color);//
        System.out.println(Color.size());//length
        System.out.println(Color.contains("pink"));//result is boolean
//read the containt of the list
       for (String c: Color)
           System.out.println(c);

        Color.forEach(System.out::println);


        for (int i=0;i< Color.size();i++){
            System.out.println(Color.get(i));
        }


        }
}
