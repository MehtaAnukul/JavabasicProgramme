import java.util.Scanner;

/**
 * Created by Anukul-PC on 14-12-2018.
 */
public class ArraySumScan {
    public static void main(String[] args) {
        int n=5,sum =0,i;
        int a[] = new int[n];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the "+n+ "Elements:");
        for( i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }

        for(i=0;i<n;i++){
            sum = sum + a[i];
        }
        System.out.println("Sum : " +sum);
    }
}
