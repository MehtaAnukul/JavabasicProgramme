/**
 * Created by Anukul-PC on 02-06-2018.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int t1=0, t2=1, n=10;
        System.out.println("first " +n+ " terms: ");

        System.out.println("the fibonacci sereies is:");
        for(int i=1;i<=n;i++){

            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;   //t2 is assign to t1
            t2 = sum;  // sum is assign to t2
        }
    }
}

// t1 t2 sum
