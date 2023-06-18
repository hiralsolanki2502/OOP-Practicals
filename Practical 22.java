Practical-22: Write a recursive method that returns the smallest integer in an array. Write 
                        a test program that prompts the user to enter an integer and display its product. 

Code:

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical22 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        Scanner input = new Scanner(System.in);
        int product=1;
        System.out.print("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
            product *= list[i];
        }
        System.out.println("The Product of elements is " + product);
    }
}
}
