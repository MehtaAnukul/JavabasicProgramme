/**
 * Created by Anukul-PC on 03-02-2018.
 */
//import java.util.Scanner;
public class ArrStrCountCharNum {
    public static void main(String args[])
    {
        String s = "Anukul12345";
        count(s);
    }
    public static void count(String s)
    {
        char ch[] = s.toCharArray();
        int letter = 0;
        int num = 0;

        for(int i=0;i<s.length();i++)

        {
            if(Character.isLetter(ch[i]))
            {
                letter++;
            }
            else if(Character.isDigit(ch[i]))
            {
                num++;
            }
        }
        System.out.println("The string is:\tAnukul12345");
        System.out.println("letter:\t" +letter);
        System.out.println("number:\t" +num);
    }
}

