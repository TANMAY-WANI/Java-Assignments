import java.util.*;
public class matricesMultiplication
{
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first matrix:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the size of second matrix:");
        r2=sc.nextInt();
        c2= sc.nextInt();
        int m1[][] = new int [r1][c1];
        int m2[][]=new int [r2][c2];
        int m3[][] = new int [r1][c2];
        if (c1==r2){
            System.out.println("Enter the first matrix:");
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c1;j++)
                    m1[i][j]=sc.nextInt();
            }
            System.out.println("Enter the second matrix:");
            for (int i=0;i<r2;i++)
            {
                for (int j=0;j<c2;j++)
                    m2[i][j]=sc.nextInt();
            }
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c2;j++)
                {
                    for (int k=0;k<c1;k++){
                        m3[i][j]+=m1[i][k]*m2[k][j];
                    }
                }
            }
            System.out.println("The output matrix is:2");
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c2;j++)
                    System.out.print(m3[i][j]+" ");
                System.out.println("");
            }
        }
        else  
            System.out.println("Invalid rows and collums for matrix multiplication!!");
        sc.close();
    }
}