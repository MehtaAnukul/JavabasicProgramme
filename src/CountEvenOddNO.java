/**
 * Created by Anukul-PC on 28-01-2018.
 */
public class CountEvenOddNO {
    public static void main(String args[]) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("odd COUNT " + oddCount);
        System.out.println("even COUNT " + evenCount);

    }
}
