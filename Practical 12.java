Practical-12: Write a program that creates a Random object with seed 1000 and 
                        displays the first 100 random integers between 1 and 49 using the
                        NextInt (49) method.


Code:

import java.time.LocalDate;
import java.time.LocalTime;

public class Practical12 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

            java.util.Random randomNo = new java.util.Random(1000);

            // displays first 100 random integers between 0 to 49
            System.out.println(" 100 Random numbers are : ");
            for (int i = 0; i < 100; i++) {
                System.out.println(randomNo.nextInt(49) + " ");

            }

        }
    }
