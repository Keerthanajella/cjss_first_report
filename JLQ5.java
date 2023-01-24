package JAVA_LOGICAL;
import java.util.Scanner;
public class JLQ5
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the direction you want to start");
        String d1=scan.next();
        System.out.println("Enter the distance");
        int t1=scan.nextInt();
        System.out.println("Enter the direction you want to turn");
        String d2=scan.next();
        System.out.println("Enter the distance");
        int t2=scan.nextInt();
        System.out.println("Enter the direction you want to turn");
        String d3=scan.next();
        System.out.println("Enter the distance");
        int t3=scan.nextInt();
        if(t1>t3)
        {
            System.out.println(d1+d2);
        }
        else
        {
            System.out.println(d2+d3);
        }



    }
}
