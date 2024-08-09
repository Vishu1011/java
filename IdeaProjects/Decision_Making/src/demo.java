import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

System.out.println("Calculator:");

        System.out.println("1.addition ");
        System.out.println("2.substration ");
        System.out.println("3.division ");
        System.out.println("4.multiplication ");
        System.out.println("5.modulus");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input switch");
        int input=sc.nextInt();


        System.out.println("Enter value of 1st number :");
        int a = sc.nextInt();

        System.out.println("Enter value of 2nd number :");
        int b = sc.nextInt();

        switch (input){

            case 1:
                System.out.println("Addition: " +(a+b));
                break;

            case 2:
                System.out.println("Substration: " +(a-b));
                break;

            case 3:
                System.out.println("division: " +(a/b));
                break;

            case 4:
                System.out.println("Multiplication: " +(a*b));
                break;

            case 5:
                System.out.println("modulus: " +(a%b));
                break;

            default:
                System.out.println("enter valid input number");
        }


    }
}
