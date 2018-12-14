 /**
 * Created by Anukul-PC on 04-02-2018.
 */

public class ArrAscending {
    public static void main(String args[])
    {

        int i,j,n=5,temp =0 ;
        int a[] = new int[n];

        a[0] = 10;
        a[1] = 20;
        a[2] = 40;
        a[3] = 30;
        a[4] = 25;

        for(i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]:\t" +a[i]);
        }

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //print array in ascending order...
        System.out.println("\nArray element in ascending order");
        for (i = 0; i < n; i++) {
            System.out.println(" " + a[i]);
        }

      //  System.out.println("Enter the value:");
        //k = sc.
    }
}
