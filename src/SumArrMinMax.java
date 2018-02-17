/**
 * Created by Anukul-PC on 03-02-2018.
 */
public class SumArrMinMax {
    public static void main(String args[])
    {
        int array[] = {10,20,30,40,50,10};
        int sum=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i] != 0)
            {
                System.out.println("a["+i+"]:\t" +array[i]);
            }
        }
        for(int i=0;i<array.length;i++)
        {
            sum = array[i] + sum;
        }
        System.out.println("the sum of array value:" +sum);

        int maxvalue = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i] > maxvalue)
            {
                maxvalue = array[i];
            }

        }
        System.out.println("\nThe Maxvalue in array :" +maxvalue);

        int minvalue = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i] < minvalue)
            {
                minvalue = array[i];
            }
        }
        System.out.println("The Minvalue in array:" +minvalue);
    }
}


