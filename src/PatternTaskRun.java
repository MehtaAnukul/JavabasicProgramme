import java.util.Scanner;

/**
 * Created by Anukul-PC on 28-05-2018.
 */
public class PatternTaskRun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No:");
        int limit;
        limit = s.nextInt();
        PatternTask t = new PatternTask();
        t.printrow(limit);


    }
}
