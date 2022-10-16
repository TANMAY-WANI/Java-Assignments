import java.util.*;
class distance
{
    double ft,inch;
    void update(int x)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice for conversion of distance:");
        System.out.println("--------------------------");
        System.out.println("1. Meters to Feets");
        System.out.println("2. Meters to Inches");
        System.out.println("--------------------------");
        int ch1 = s.nextInt();
        switch (ch1)
        {
            case 1:
            ft = 3.2808*x;
            System.out.printf("Distance in feet = %.2f\n",ft);
            break;
            case 2:
            inch = x*39.37;
            System.out.printf("Distance in inches = %.2f\n",inch);
            break;
            default:
            System.out.println("Invalid Choice!!!");
            break;
        }
        s.close();
    }
    
}
public class Assignment1
{
    public static void main(String[] args) {
        System.out.println("Enter the distance in meters:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        distance d1 = new distance();
        d1.update(m);
        sc.close();

        
    }
}
