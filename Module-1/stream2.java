import java.util.Scanner;

class stream2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        drawPyramid(s);
        sc.close();
    }

    static void drawPyramid(String s) {
        for(int i=0; i<s.length(); i++) {
            // spaces
            for(int j=i; j<s.length(); j++)
                System.out.print(" ");
            // Characters
            for(int j=0; j<=i; j++)
                System.out.print(s.charAt(j) + " ");
            // newline
            System.out.println();
        }
    }
}