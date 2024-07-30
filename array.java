import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //array of primitives
//         int[] arr = new int[5];
//         arr[0]=12;
//     arr[1]=23;
// System.out.println(arr[1]); 
 Scanner in =new Scanner(System.in);   

// //Input using for loops
// for(int i=0;i<arr.length;i++){
//     arr[i]=in.nextInt();
// }
// System.out.println(Arrays.toString(arr));

// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]+" ");
// }

// for(int num:arr){  //for every element in array,print the element
//     System.out.println(num +" "); // here num represents element of the array
// }
// System.out.println(arr[5]); //index out of bound error


//array of objects
String[] str=new String[4];
for(int i=0;i<str.length;i++){

    str[i]=in.next();
}
System.out.println(Arrays.toString(str));



//Modify
str[1]="Rohit";
System.out.println(Arrays.toString(str));
in.close();
}
    
}
