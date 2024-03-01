package JavaData;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class theSet {

    public static void main(String[] args) {
//List accept douplicates
// set dont accept douplicates
     //Set->
        //->treeSet same methods as HashSet
        //->hashmap

        Set<balls> b =new HashSet<>();
        b.add(new balls("blue"));
        b.add(new balls("yellow"));
        b.add(new balls("purple"));
        b.add(new balls("blue"));//this is not been returned cause it refuse duplicates
        System.out.println(b.size());

        b.remove(new balls("blue"));
        //b.remove(object_name)

        //return the set //it return the data not by order
        b.forEach(System.out::println);
        System.out.println(b.size());








    }


    static class balls{
        String colors;
        public balls(String colors){
            this.colors=colors;
        }

        //we should overwrite the method equals and hashcode
        //to use the sets correctly and avoid the deplicates
        //cause in some cases setes read the adress memory and not the content
        //of the sets and consider duplicate values as different values


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            balls balls = (balls) o;
            return Objects.equals(colors, balls.colors);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colors);
        }




        //we should overwrite the mothod toString cause the return result is the
        //adress memory of the data and not the values of the data


        @Override
        public String toString() {
            return "balls{" +
                    "colors='" + colors + '\'' +
                    '}';
        }
    }
//record balls(String colors){}
}
