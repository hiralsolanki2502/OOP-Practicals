Practical-14: Write a program that creates an Array List and adds a Loan object , a  
                        Date object , a string, and a Circle object to the list, and use a loop to 
                        display all elements in the list by invoking the object’s to String() method.


Code:
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Practical14 {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        ArrayList<Object> arr_list = new ArrayList<Object>();
        arr_list.add(new Loan(10000));
        arr_list.add(new Date());
        arr_list.add(new String("GTU Practical"));
        arr_list.add(new Circle1(3.45));
        for (int i = 0; i < arr_list.size(); i++)
        {
            System.out.println((arr_list.get(i)).toString());
        }
    }
}
class Circle1
{
    double radius;
    Circle1(double r)
    {
        this.radius=r;
    }
    public String toString()
    {
        return "Circle with Radius "+this.radius;
    }
}
class Loan
{
    double amount;
    Loan(double amt)
    {
        this.amount=amt;
    }
    public String toString()
    {
        return "Loan with Amount "+this.amount;
    }
}
