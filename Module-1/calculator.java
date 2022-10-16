import java.util.*;
public class calculator
{
    public static void main(String[] args) {
        int n1,n2;
        String op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number - 1:");
        n1 = sc.nextInt();
        System.out.println("Enter number - 2:");
        n2 = sc.nextInt();
        System.out.println("Enter the operation (+,-,*,/):");
        Scanner s = new Scanner(System.in);
        op = s.nextLine();
        switch (op){
            case "+":
            System.out.println("Ans = "+ (n1+n2));
            break;
            case "-":
            System.out.println("Ans = "+ (n1-n2));
            break;
            case "*":
            System.out.println("Ans = "+ (n1*n2));
            break;
            case "/":
            if (n2!=0)
                System.out.println("Ans = "+ (n1/n2));
            else
                System.out.println("Cannot divide by zero!");
            break;
            default:
            System.out.println("Invalid Operator!!");
            break;
        }

        s.close();
        sc.close();
    }
}