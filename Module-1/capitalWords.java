import java.util.*;
public class capitalWords
{
    public static void main(String[] args) {
        System.out.println("Enter the no of words you want to enter:");
        Scanner sc = new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int x= sc.nextInt();
        String[] arr = new String[x];
        String abc = "QWERTYUIOPASDFGHJKLZXCVBNM";
        int flag=0,count=0;
        for (int i=0;i<x;i++)
        {
            arr[i]=s.nextLine();
        }
        for (int i=0;i<x;i++)
        {
            for (int j=0;j<abc.length();j++)
            {
                
                if (arr[i].charAt(0)==abc.charAt(j))
                {
                    flag=1;
                }
            }
            if (flag==1)
                count++;
            flag=0;
        }
        System.out.println("The total no of words starting from capital letter is: "+count);
        sc.close();
        s.close();
    }
}
