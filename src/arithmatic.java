/**
 * Created by Anukul-PC on 08-01-2018.
 */
import java.util.Scanner;
public class arithmatic
{
    public static void main(String arg[])
    {
        int a,b,n,i,x;
        float ans;

        while(true) {

            Scanner s = new Scanner(System.in);

            System.out.println("");
            System.out.println("enter the first no:");
            a = s.nextInt();
            System.out.println("enter the second no:");
            b = s.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("1.sum");
            System.out.println("2.sub");
            System.out.println("3.mul");
            System.out.println("4.div");
            System.out.println("5.mod");
            System.out.println("6.Exit");
            System.out.println("");
            System.out.println("Enter your choice:");
            n = s.nextInt();

            switch (n) {
                case 1:
                    ans = a + b;
                    System.out.println("\nAddition:" + ans);
                    break;
                case 2:
                    ans = a - b;
                    System.out.println("\nSubtraction:" + ans);
                    break;
                case 3:
                    ans = a * b;
                    System.out.println("\nMultiplication:" + ans);
                    break;
                case 4:
                    ans = a / b;
                    System.out.println("\nDivision:" + ans);
                    break;
                case 5:
                    ans = a % b;
                    System.out.println("\nModulo division:" + ans);
                    break;
                case 6:
                    System.exit(0);


            }
        }

    }

}

