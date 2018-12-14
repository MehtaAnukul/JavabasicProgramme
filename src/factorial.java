/**
 * Created by Anukul-PC on 03-03-2018.
 */
public class factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact=fact*i;

        }
        System.out.println("the factotial of " +num+ " is " +fact);
    }

}
//  5!            5*4*3*2*1
//  1*1=1
//  1*2=2
//  2*3=6
//  6*4=24
//  24*5=120
