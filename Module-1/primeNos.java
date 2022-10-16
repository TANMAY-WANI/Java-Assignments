import java.lang.Math;
import java.util.Scanner;

public class primeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanning new integer!!
        System.out.print("Enter Number of Primes to be found: ");
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        int flag = 0;
        System.out.println("Prime Elements are: ");
        int count = 0;
        for (int i = 2; count <n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
            flag = 0;
        }
        sc.close();
    }

}