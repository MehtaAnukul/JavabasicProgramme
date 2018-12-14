import java.util.Scanner;

/**
 * Created by Anukul-PC on 11-01-2018.
 */
public class Mtask1 {
    public static void main(String arg[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int y;
            System.out.println("\nchoose your choice");
            System.out.println("\n1.Arithmatic");
            System.out.println("2.Search_element");
            System.out.println("3.Sorting_array_ad");
            System.out.println("4.Palindrome_str");
            System.out.println("5.Palindrome_num");
            y = sc.nextInt();

            switch (y) {
                case 1:
                    int a, b, i, x, n;
                    float ans;
                    Scanner s = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("enter the first no:");
                    a = s.nextInt();
                    System.out.println("enter the second no:");
                    b = s.nextInt();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("1.sum");
                    System.out.println("2.sub");
                    System.out.println("3.mul");
                    System.out.println("4.div");
                    System.out.println("5.mod");
                    System.out.println("6.Exit");
                    System.out.println("");
                    System.out.println("Enter your choice:");
                    n = s.nextInt();
                    switch (n) {

                        case 1:
                            ans = a + b;
                            System.out.println("\nAddition:" + ans);
                            break;
                        case 2:
                            ans = a - b;
                            System.out.println("\nSubtraction:" + ans);
                            break;
                        case 3:
                            ans = a * b;
                            System.out.println("\nMultiplication:" + ans);
                            break;
                        case 4:
                            ans = a / b;
                            System.out.println("\nDivision:" + ans);
                            break;
                        case 5:
                            ans = a % b;
                            System.out.println("\nModulo division:" + ans);
                            break;
                        case 6:
                            System.exit(0);
                            break;
                    }
                    break;

                case 2:
                    int size, tosearch, flag = 0;
                    Scanner ss = new Scanner(System.in);
                    System.out.println("Enter the size of array:");
                    size = ss.nextInt();

                    int z[] = new int[size];
                    System.out.println("Enter element in array:");
                    for (i = 0; i < size; i++) {
                        z[i] = ss.nextInt();
                    }

                    System.out.println("\nEnter element to search:");
                    tosearch = ss.nextInt();

                    for (i = 0; i < size; i++) {
                        if (z[i] == tosearch) {
                            flag = 1;
                            break;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Element found in position:" + (i + 1));
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 3:
                    int j, temp = 0;


                    Scanner sa = new Scanner(System.in);
                    System.out.println("\nEnter the size of array:");
                    n = sa.nextInt();
                    int q[] = new int[n];

                    System.out.println("Enter " + n + " elements:");
                    for (i = 0; i < n; i++) {
                        q[i] = sa.nextInt();
                    }

                    System.out.println("\nchoose your sorting order");
                    System.out.println("1.Ascending");
                    System.out.println("2.decsending");

                    x = sa.nextInt();


                    switch (x) {
                        case 1:
                            //now arrage array in ascending order..
                            for (i = 0; i < n; i++) {
                                for (j = i + 1; j < n; j++) {
                                    if (q[i] > q[j]) {
                                        temp = q[i];
                                        q[i] = q[j];
                                        q[j] = temp;
                                    }
                                }
                            }
                            //print array in ascending order...
                            System.out.println("\nArray element in ascending order");
                            for (i = 0; i < n; i++) {
                                System.out.println(" " + q[i]);
                            }
                            break;

                        case 2:
                            //now arrage array in descending order..
                            for (i = 0; i < n; i++) {
                                for (j = i + 1; j < n; j++) {
                                    if (q[i] < q[j]) {
                                        temp = q[i];
                                        q[i] = q[j];
                                        q[j] = temp;
                                    }
                                }
                            }
                            //print array in descending order...
                            System.out.println("\nArray elements in descending order:");
                            for (i = 0; i < n; i++) {
                                System.out.println(" " + q[i]);
                            }
                            break;
                    }
                    break;

                case 4:
                    String str, rev = "";
                    int length;
                    Scanner sd = new Scanner(System.in);

                    System.out.println("Enter a string:");
                    str = sd.nextLine();

                    length = str.length();

                    for (i = length - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }

                    if (str.equals(rev)) {
                        System.out.println(str + " is a palindrome");
                    } else {
                        System.out.println(str + "is not a palindrome");
                    }
                    break;

                case 5:
                    int num, tnum, sum;
                    Scanner sk = new Scanner(System.in);

                    System.out.println("Enter the no:");
                    num = sk.nextInt();

                    tnum = num;
                    sum = 0;

                    //find reverse number
                    while (tnum > 0) {
                        sum = (sum * 10) + (tnum % 10);
                        tnum = tnum / 10;
                    }

                    //check inputted number with reversed
                    if (num == sum) {
                        System.out.println(num + " is a palindrome no");
                    } else {
                        System.out.println(num + " is not a palindrome no");
                    }
                    break;
            }
        }

    }

}

