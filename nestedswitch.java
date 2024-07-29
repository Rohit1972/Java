import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();

        switch (empID) {
            case 1:
                System.out.println("Rohit Kumar");
                break;
            case 2:
            System.out.println("Rahul Rana");
            break;

            case 3:
            System.out.println("Emp Number 3");
            switch (department) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Management":
                System.out.println("Management Department");
                break;
                default:
                System.out.println("No Department entered");
                    
            }
            break;
            default:
            System.out.println("Enter correct ID");
            in.close();
               
        }


    }
}
