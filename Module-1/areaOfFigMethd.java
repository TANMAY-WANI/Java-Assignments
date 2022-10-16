
import java.util.*;
class areaOfFigures
{
    static void area(int a)
    {
        System.out.println("The area of the square is: "+Math.pow(a,2));
    }
    static void area (int a,int b)
    {
        System.out.println("The area of rectangle is :"+a*b);
    }
    static void area(int a,int b,int c)
    {
        double s= (a+b+c)/2;
        double ar =  Math.sqrt((s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is: "+ar);
    }
}
public class areaOfFigMethd
{
    public static void main(String[] args) {
        int ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape from the choices given below:");
        System.out.println("1. Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        ch1 = sc.nextInt();
        switch (ch1){
            case 1:
            int a;
            System.out.println("Enter the side of the square:");
            a = sc.nextInt();
            areaOfFigures.area(a);
            break;
            case 2:
            int x,y;
            System.out.println("Enter the length and breadth of the rectangle:");
            x= sc.nextInt();
            y = sc.nextInt();
            areaOfFigures.area(x,y);
            break;
            case 3:
            int l,m,n;
            System.out.println("Enter the sides of the triangle:");
            l = sc.nextInt();
            m = sc.nextInt();
            n=sc.nextInt();
            areaOfFigures.area(l,m,n);
            break;
            default:
            System.out.println("You have entered an invalid choice!!!");
            System.out.println("Code exiting with many errors!!!");
        }
        sc.close();
    }
}