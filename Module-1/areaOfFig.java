import java.util.*;
class shape
{
    void area()
    {}
}
class Square extends shape
{
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the square:");
        float len = s.nextFloat();
        float ar = len*len;
        s.close();
        System.out.println("The area of square is :"+ar);
    }
}
class Rectangle extends shape
{
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        float len = s.nextInt();
        float brd = s.nextInt();
        float ar = len*brd;
        s.close();
        System.out.println("The area of the rectangle is :"+ar);
    }
}
class Triangle extends shape
{
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle:");
        float len = s.nextFloat();
        float brd = s.nextFloat();
        float ar = (len*brd)/2;
        s.close();
        System.out.println("The area of the triangle is :"+ar);
    }
}
class Trapazium extends shape
{
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the height and sum of parralel sides of trapazium");
        float len = s.nextFloat();
        float brd = s.nextFloat();
        float ar = (len*brd)/2;
        s.close();
        System.out.println("The area of the trapazium is :"+ar);
    }
}
class Circle extends shape
{
    void area()
    {
        float pi = 3.14f;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float len = s.nextFloat();
        float ar = pi*len*len;
        s.close();
        System.out.println("The area of the circle is :"+ar);
    }
}
class Parallelogram extends shape
{
    void area()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base and height of the parallelogram:");
        float len = s.nextFloat();
        float brd = s.nextFloat();
        float ar = (len*brd);
        s.close();
        System.out.println("The area of the parallelogram is :"+ar);
    }
}
public class areaOfFig
{
    public static void main(String[] args) {
        int ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape from the choices given below:");
        System.out.println("1. Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.println("4.Parallelogram");
        System.out.println("5.Circle");
        System.out.println("6.Trapazium");
        ch1 = sc.nextInt();
        switch (ch1){
            case 1:
            shape sq = new  Square();
            sq.area();
            break;
            case 2:
            shape rec = new  Rectangle();
            rec.area();
            break;
            case 3:
            shape tri = new Triangle();
            tri.area();
            break;
            case 4:
            shape pllgm = new Parallelogram();
            pllgm.area();
            break;
            case 5:
            shape cir = new Circle();
            cir.area();
            break;
            case 6:
            shape tra = new Trapazium();
            tra.area();
            break;
            default:
            System.out.println("The entered choice is either invalid or not currently available.");
            break;

        }
        sc.close();
    }
}