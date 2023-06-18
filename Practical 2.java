Practical-02: Write a program that solves the following equation and displays the value    
                       x and y: 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve 
                       equation ax+by=e  x=ed-bf/ad-bc,cx+dy=f  y=af-ec/ad-bc ) 


Code: 

import java.time.LocalDate;
import java.time.LocalTime;

public class Practical2 {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        float a=3.4f;
        float b=50.2f;
        float e=44.5f;
        float c=2.1f;
        float d=0.55f;
        float f=5.9f;

        float x=((e*d)-(b*f))/((a*d)-(b*c));
       float y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("The Answer of X = " +x);
        System.out.println("The Answer of Y = " +y);
    }
}
