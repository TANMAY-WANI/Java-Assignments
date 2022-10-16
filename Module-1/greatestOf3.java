import java.util.*;
public class greatestOf3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nos:");
        int a,b,c;
        a = sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("answer:");
        if (a>b && a>c)
            {System.out.println(a);}
        else if (b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        sc.close();
    }
}