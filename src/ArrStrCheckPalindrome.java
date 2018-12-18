/**
 * Created by Anukul-PC on 04-02-2018.
 */
public class ArrStrCheckPalindrome {
    public static void main(String args[]) {
        int i;
        String rev = "";
        String str[] = {"abc", "madam", "sak", "kkk"};
        for (i = 0; i < str.length; i++) {
            System.out.println("a[" + i + "]:\t" + str[i]);
        }

        for (i = 0; i < str.length; i++) {

            int length = str[i].length();
            System.out.println(length);

        }

        for (i = 0; i < str.length; i++) {

            String subStr = str[i];
            int length = subStr.length();

            for (int j = length - 1; j >= 0; j--) {
                rev = rev + subStr.charAt(j);
            }

            if (subStr.equals(rev)) {
                System.out.println(subStr + " is a palindrom ");
            } else {
                System.out.println(subStr + " is not a palindrome");

            }
            rev = "";
        }
    }
}



