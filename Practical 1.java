Practical-01: Write a Program that displays Welcome to Java, Learning Java Now and  
              Programming is fun.



Code: 

import java.time.LocalDate;
import java.time.LocalTime;


public class Practical1 {
   public static void main(String []args){
       LocalDate myObj = LocalDate.now();
       LocalTime myObj1 = LocalTime.now();
       System.out.println("DATE: "+myObj);
       System.out.println("TIME: "+myObj1);
       System.out.println("ENROLL NO: 210130107089");
       System.out.println("---------------------------------------------");


       System.out.println("Welcome to Java");
       System.out.println("Learning Java Now and Programming is fun");
   }
}


