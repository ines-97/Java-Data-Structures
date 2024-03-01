package JavaData;
import java.util.Arrays;

public class theArray {
    public static void main (String[]args){

 //arrays have a fixed number of indexs and the first index is 0
        String[] colors= new String[5];//definition of the arrays
        colors[0]="purple";
        colors[1]="blue";
        System.out.println("------affichage of the array------1st method---");
        System.out.println(Arrays.toString(colors));
        System.out.println("------affichage of the array------2nd method---");
        colors[2]="yellow";
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        int[] number={100,200};//definition of the array 2nd method

        System.out.println("-------use loop the read the content of the arrays---------");
//classic loop
        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }
//advanced loop
        for(String color:colors){
        System.out.println(color);
        }
//More advanced loop
        Arrays.stream(colors).forEach(System.out::println);
        System.out.println(Arrays.toString(colors));

    }
}
