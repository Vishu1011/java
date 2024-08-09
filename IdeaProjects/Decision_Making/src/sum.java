import java.util.Scanner;

public class sum {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int x = sc.nextInt();

        int sum=0;

        while(x<=10)
        {
         sum= sum+x;
         x++;

        }
        System.out.println(sum);
    }
}
