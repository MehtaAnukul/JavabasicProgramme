/**
 * Created by Anukul-PC on 17-01-2018.
 */
public class reverseTriangle {
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
