Practical-09: Write a method with following method header. 
                       public static int gcd(int num1, int num2) Write a program that prompts 
                       the user to enter two integers and compute the gcd of two integers.


Code: 
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practical9 {
    public static int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
        public static void main(String[]args){
            LocalDate myObj = LocalDate.now();
            LocalTime myObj1 = LocalTime.now();
            System.out.println("DATE: "+myObj);
            System.out.println("TIME: "+myObj1);
            System.out.println("ENROLL NO: 210130107089");
            System.out.println("---------------------------------------------");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter First Number  : ");
            int number1 = input.nextInt();
            System.out.print("Enter Second Number : ");
            int number2 = input.nextInt();
            System.out.print("GCD of " + number1 + " and " + number2 + " = " + gcd(number1, number2));

        }
    }

