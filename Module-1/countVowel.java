import java.util.*;
public class countVowel
{
    public static void main(String[] args) {
       System.out.println("enter the sentence");
       Scanner sc= new Scanner(System.in);
       String s =  sc.nextLine();
       String abc = "aAeEiIoOuU";
       int flag=0,count=0,countcon=0;
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
                else  
                    countcon++;
                flag=0;
            }
       }
       System.out.println("The total no of vowels in the entered sentence is : "+count);
       System.out.println("The total no of consonents in the entered sentence is : "+countcon);

       sc.close();
    }
}