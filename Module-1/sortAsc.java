import java.util.*;
public class sortAsc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the elements of the array:");
            array[i]=sc.nextInt();
        }
        int tv;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<(n-1-i);j++)
            {
                if (array[j]>array[j+1])
                {
                    tv=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tv;
                }
            }
        }
        System.out.println("Successfully compleated bubble sort.");
        System.out.println("The output array is:");
        for (int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}