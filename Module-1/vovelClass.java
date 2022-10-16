import java.util.*;
public class vovelClass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int flag = 0,count=0;
        while (true)        
        {
            s = sc.nextLine();
            if(s.equals("quit"))
                break;
            else{
                String abc = "aAeEiIoOuU";
                for (int i=0;i<s.length();i++)
                {
                    if (Character.isLetter(s.charAt(i)))
                    {
                    for (int j=0;j<abc.length();j++)
                    {
                        if(s.charAt(i)==abc.charAt(j))
                            flag=1;
    
                    }
                    if (flag==1)
                        count++;
                    flag=0;
                    }
                }
            }
            System.out.println("The no of vowels: "+count);
            count =0;
        }
        sc.close();
    }
}