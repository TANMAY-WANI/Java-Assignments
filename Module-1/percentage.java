import java.util.*;
public class percentage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float arr[] = new float [6];
        float x;
        for (int i=0;i<6;i++)
        {
            System.out.println("Enter the marks of subject"+ (i+1)+":");
            x = sc.nextFloat();
            arr[i]=x;
        }
        float total=0;
        for (int i=0;i<6;i++)
            total+=arr[i];
        float per1 = (total/600)*100;
        System.out.println("Percentage = "+per1+"%");
        sc.close();
    }
}