/**
 * Created by Anukul-PC on 04-02-2018.
 */
public class ArrStrCheckPalindrome {
    public static void main(String args[])
    {
        int i,length;
        String rev="";
        String str[] = {"abc","madam","sak","kkk"};
        for(i=0;i<str.length;i++)
        {
            System.out.println("a["+i+"]:\t" +str[i]);
        }

        for(i=0;i<str.length;i++)
        {
            length = str[i].length();
            System.out.println(length);
        }

      /* for(i=length-1; i>=0; i--)
       {
           rev = rev + str[i].charAt(i);
       }

        if(str[i].equals(rev))
        {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ "is not a palindrome");
        }
*/

    }
}
