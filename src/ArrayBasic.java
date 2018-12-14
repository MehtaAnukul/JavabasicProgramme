/**
 * Created by Anukul-PC on 28-01-2018.
 */
public class ArrayBasic {
    public static void main(String args[]) {

        int a[] = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[3] = 20;
        a[5] = 20;
        a[6] = 0;
        // a[7] = 20;
//        a[9] = 20;
//

        //  System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println("a[" + i + "]:\t" + a[i]);
            }

        }


//        for(int i=0;i<a)
//        System.out.println("a[]")

    }
}