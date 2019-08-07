/**
 * Created by Anukul-PC on 07-08-2019.
 */
public class powerFunction {

    public static long anukul(int x, int y) {
        long result = x;
        for (int i = 1; i < y; i++) {
            result = result * x;
        }
        return result;
    }


    public static void main(String[] args) {
        long sum = 0;
        int y = 1, x = 1;
        for (int i = 1; i <= 5; i++) {
            sum = sum + anukul(x, y);
            System.out.println("anukul :"+anukul(x,y));
            x++;
            y++;
            System.out.println(sum);

        }

    }
}
