/**
 * Created by Anukul-PC on 08-01-2018.
 */
import java.util.Scanner;
public class Search_Element {
    public static void main(String arg[])
    {
        int size,i,tosearch,flag=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size = s.nextInt();

        int a[] = new int[size];
        System.out.println("Enter element in array:");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("\nEnter element to search:");
        tosearch = s.nextInt();

        for(i=0;i<size;i++)
        {
            if(a[i] == tosearch)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found in position:"+(i+1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
