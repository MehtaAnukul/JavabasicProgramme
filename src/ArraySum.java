/**
 * Created by Anukul-PC on 28-01-2018.
 */
public class ArraySum {
    public static void main(String args[])
    {
        int a[] = new int[10];

        a[0]=10;
        a[1]=10;
        a[2]=10;
        a[3]=10;
        a[4]=10;

        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = a[i] + sum;

        }
        System.out.println(sum);
    }
}
