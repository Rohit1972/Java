import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(67);
        list.add(657);
        list.add(657);
        list.add(6527);
        list.add(657);
        list.add(657);
        list.add(6537);
        list.add(6547);
        list.add(657);
        System.out.println(list.contains(654));
        list.set(0,99);
        list.remove(2);

        System.out.println(list);

        //input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));  //pass index here,list[index] syntax will not work here
        }

        System.out.println(list);
        in.close();
    }
    
}
