Practical-04: Body Mass Index (BMI) is a measure of health on weight. It can be      
                       calculated by taking your weight in kilograms and dividing by the square
                       of your height in meters. Write a program that prompts the user to enter a 
                       weight in pounds and height in inches and displays the BMI. 
                       Note:- 1 pound=0.45359237 Kg and 1 inch=0.0254 meters.


Code: 
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Practical4 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        Scanner sc=new Scanner(System.in);
        System.out.println("BODY WEIGHT INDEX (BMI) CALCULATE PROGRAM.............");

        System.out.println("Enter weight in pound:");
        int w=sc.nextInt();
        System.out.println("Enter height in inch:");
        float h=sc.nextFloat();

        float Answer=(w*0.45359237f)/((h*0.0254f)*(h*0.0254f));

        System.out.println("BMI="+Answer);
    }

}
