import java.util.Scanner;

/**
 * Created by Anukul-PC on 14-12-2018.
 */
public class SumOfTwoNo {
    public static void main(String[] args) {
        int a,b,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st No:");
        a = s.nextInt();
        System.out.println("Enter the 2nd No:");
        b = s.nextInt();

        n = a + b;
        System.out.println("Sum of Two no is :"+n);
    }
}
