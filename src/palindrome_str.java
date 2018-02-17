/**
 * Created by Anukul-PC on 08-01-2018.
 */
import java.util.Scanner;
public class palindrome_str {
    public static void main(String arg[])
    {
        String str,rev="";
        int length,i;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = s.nextLine();

        length = str.length();

        for(i=length-1; i>=0; i--)
        {
          rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ "is not a palindrome");
        }
    }
}
