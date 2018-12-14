import java.util.Scanner;

/**
 * Created by Anukul-PC on 17-01-2018.
 */
public class User_v_triangle {
    public static void main(String args[])
    {
        int i,space,row,k=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of row:");
        row = s.nextInt();
        for(i=1;i<=row;i++)
        {
            for (space=1;space<=(row-i);space++)
            {
                System.out.print(" ");
            }
            while(k!=(2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k=0;
            System.out.println();
        }
    }
}
