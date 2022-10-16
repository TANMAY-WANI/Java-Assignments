public class diamond {
    public static void main(String Args[]) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <= 3-i; j++)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print("*" + " ");
            System.out.println(" ");
        
        }
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=i; j++)
                System.out.print(" ");
            for (int k = 0; k <3- i; k++)
                System.out.print("*" + " ");
            System.out.println(" ");
        
        }
    }
}