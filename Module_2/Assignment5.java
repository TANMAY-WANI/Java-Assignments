// Write a program to show the difference between public and private access specifiers. 
// The program should also show that primitive data types are passed by value and objects are
// passed by reference and to learn use of final keyword

import java.net.SocketTimeoutException;
import java.util.Scanner;
class employee
{
    public int empno;
    private int empPass;
    final int compCode = 100191;
    employee(int eno)
    {
        empno = eno;
        empPass = eno+101;
    }
    void Increment(int val){
        val++;
        System.out.println("updated value = "+val);
    }
    void inc(employee e){
        e.empno++;
        System.out.println("Updated value: "+e.empno);
    }
}

public class Assignment5
{
    public static void main(String[] args) {
        employee emp = new employee(1);
        Scanner sc = new Scanner(System.in);
        // difference between public and private access specifiers
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("1. Public value modifier");
        System.out.println("2. Private value modifier");
        System.out.println("3. Final value modifier");
        System.out.println("4. primitive data increment");
        System.out.println("5. Object data increment");
        System.out.println("- - - - - - - - - - - - - - - -");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter new value");
                int newVal1 = sc.nextInt();
                try{
                    emp.empno = newVal1;
                    System.out.println("Updated value: "+emp.empno);
                }
                catch(Exception e){
                    System.out.println("Cannot access public variable");
                }
                break;
            case 2:
                System.out.println("Enter new value");
                int newVal2 = sc.nextInt();
                try{
                    // emp.empPass = newVal2;
                    // System.out.println("Updated value: "+emp.empPass);
                }
                catch(Exception e){
                    System.out.println("Cannot access private variable");
                }
                System.out.println("Cannot access private variable");
                break;
            case 3:
                System.out.println("Enter new value");
                int newVal3 = sc.nextInt();
                try{
                    // emp.compCode = newVal3;
                    // System.out.println("Updated value: "+emp.compCode);
                }
                catch(Exception e){
                    System.out.println("Cannot update final variable");
                }
                System.out.println("Cannot update final variable");
                break;
            case 4:
                System.out.println("Enter a value");
                int x = sc.nextInt();
                emp.Increment(x);
                System.out.println("value = "+x);
                break;
            case 5:
                emp.inc(emp);
                System.out.println("value = "+emp.empno);
                break;
            default:
                break;
        }
    }
}
