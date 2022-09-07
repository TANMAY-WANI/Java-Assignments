//Sub-Class constructor invokes the construtor of the parent class
//Author: Tanmay Wani

class student{
    String Name;
    String collegeName;
    int rollNo;
    int year;
    student (){
        Name = "noName";
        collegeName = "Pandit Deendayal Energy University";
        rollNo = 0;
        year = 1;
    }
    void display(){
        System.out.println("Name: "+this.Name);
        System.out.println("Roll No: "+this.rollNo);
        System.out.println("Year: "+this.year);
        System.out.println("College Name: "+this.collegeName);
    }

}
class branch extends student{
    String schoolName;
    public branch (){
        schoolName = "SOT";
    }
    void display(){
        System.out.println("Name: "+this.Name);
        System.out.println("Roll No: "+this.rollNo);
        System.out.println("School: "+this.schoolName);
        System.out.println("Year: "+this.year);
        System.out.println("College Name: "+this.collegeName);
    }
}

public class Assignment3
{
    public static void main(String[] args) {
        System.out.println(">>> Creating a parent class instance:");
        student s1 = new student();
        System.out.println("=================================================");
        s1.display();
        System.out.println("=================================================");
        System.out.println(">>> Creating a child class instance:");
        System.out.println("=================================================");
        branch b1 = new branch();
        b1.display();
        System.out.println("=================================================");
        System.out.println(">>> Thank You");
        System.out.println(">>> Exiting!!");
        System.out.println("=================================================");
        
    }
}
