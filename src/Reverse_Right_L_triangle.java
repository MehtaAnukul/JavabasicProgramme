/**
 * Created by Anukul-PC on 17-01-2018.
 */
public class Reverse_Right_L_triangle {
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
