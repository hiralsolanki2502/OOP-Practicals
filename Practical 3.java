Practical-03: Write a program that reads a number in meters, converts it to feet, and 
                       Displays the result.


Code: 
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Practical3 {
    public static void main(String []args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of meter:");
        int a=sc.nextInt();

        float result=a*3.28084f;
        System.out.println("Amswer= "+result+ " feet");
        }
    }
