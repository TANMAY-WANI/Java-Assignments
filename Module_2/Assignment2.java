import java.util.*;
class Distance
{
    Scanner sc = new Scanner(System.in);
    int ft,inch;
    void getData(){
        System.out.println("Enter the feet part");
        ft = sc.nextInt();
        while (true){
            System.out.println("Enter the inch part:");
            inch = sc.nextInt();
            if (inch<12)
                break;
            else
                System.out.println("Invalid input for inch. Try Again");
        }
    }
    void add(Distance temp){
        int x,y;
        x = ft + temp.ft;
        y = inch + temp.inch;
        if (y>=12){
            y-=12;
            x++;
        }
        System.out.println("Added distance = "+x+"ft "+y+"\"");
    }
}
public class Assignment2
{
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        d1.getData();
        d2.getData();
        d1.add(d2);
    }
}
