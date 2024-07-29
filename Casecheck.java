import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if (ch>='a'&&ch<='z') {
            System.out.println("The Character entered by the user is lowercase character.");
        }else{
            System.out.println("The Character entered by the user is uppercase character.");
        }
        System.out.println("And the character entered by the user is " + ch);
        in.close();
    }
}
