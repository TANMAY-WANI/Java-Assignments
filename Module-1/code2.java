public class code2
{
    public static void main(String[] args) {
        int x=1;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=(5-i);j++)
                System.out.print(" ");
            for (int k=1;k<=i;k++)
            {
                System.out.print(x%2);
                x++;
            }
            System.out.println("");
        }
    }
}