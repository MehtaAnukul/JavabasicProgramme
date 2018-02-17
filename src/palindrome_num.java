/**
 * Created by Anukul-PC on 09-01-2018.
 */
import java.util.*;
public class palindrome_num {
    public static void main(String arg[])
    {
        int num,tnum,sum;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no:");
        num = s.nextInt();

        tnum=num;
        sum=0;

        //find reverse number
        while(tnum>0)
        {
            sum = (sum*10) + (tnum%10);
            tnum = tnum/10;
        }

        //check inputted number with reversed
        if (num == sum)
        {
            System.out.println(num+" is a palindrome no");
        }
        else
        {
            System.out.println(num+" is not a palindrome no");
        }
    }

}
