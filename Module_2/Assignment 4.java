//Program to develop an overload constructor
//Author: Tanmay Wani
import java.util.*;
class dist
{
    Scanner sc = new Scanner(System.in);
    int ft,inch;
    dist(){  //Normal Constructor
        ft = 6;
        inch = 7;
    }
    dist(int ft,int inch){  //Parameterised constructor
        this.ft = ft;
        this.inch = inch;
    }
    dist(dist t){  //Copy constructor
        this.ft = t.ft;
        this.inch = t.inch;
    }

    void display(){
        System.out.println("Distance  = "+ft+"ft "+inch+"\"");
    }
}
public class Assignment4
{
    public static void main(String[] args) {
        dist d1= new dist();
        System.out.println("NORMAL CONSRTUCTOR:");
        d1.display();
        System.out.println("Enter the values of feet and inch for paramertised constructor:");
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        dist d2 = new dist(x,y);
        dist d3 = new dist(d2);
        System.out.println("PARAMERTISED CONSTRUCTOR:");
        d2.display();
        System.out.println("COPY CONSTRUCTOR:");
        d3.display();
    }
}
