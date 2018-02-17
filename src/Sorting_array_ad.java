/**
 * Created by Anukul-PC on 11-01-2018.
 */
/**
 * Created by Anukul-PC on 09-01-2018.
 */
import java.util.Scanner;
public class Sorting_array_ad {
    public static void main(String arg[])
    {
        int n,i,j,temp=0,x;

        while(true)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("\nEnter the size of array:");
            n = s.nextInt();
            int a[] = new int[n];

            System.out.println("Enter "+n+" elements:");
            for(i=0;i<n;i++)
            {
                a[i] = s.nextInt();
            }

            System.out.println("\nchoose your sorting order");
            System.out.println("1.Ascending");
            System.out.println("2.decsending");

            x = s.nextInt();

            switch (x) {
                case 1:
                    //now arrage array in ascending order..
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
                    break;

                case 2:
                    //now arrage array in descending order..
                    for (i = 0; i < n; i++) {
                        for (j = i + 1; j < n; j++) {
                            if (a[i] < a[j]) {
                                temp = a[i];
                                a[i] = a[j];
                                a[j] = temp;
                            }
                        }
                    }
                    //print array in descending order...
                    System.out.println("\nArray elements in descending order:");
                    for (i = 0; i < n; i++) {
                        System.out.println(" " + a[i]);
                    }
                    break;
            }
        }
    }
}

