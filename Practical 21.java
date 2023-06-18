Practical-21: Write a program to create a file name 123.txt, if it does not exist. Append a 
                        new data to it if it already exist. write 150 integers created randomly into 
                        the file using Text I/O. Integers are separated by space. 

Code:

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Practical21 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        System.out.println("DATE: "+myObj);
        System.out.println("TIME: "+myObj1);
        System.out.println("ENROLL NO: 210130107089");
        System.out.println("---------------------------------------------");

        File file = new File("123.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter output = new PrintWriter(file);) {
            // writing 150 integers created randomly to file
            for (int i = 0; i < 150; i++) {
                output.print(((int) (Math.random() * 400) + 1) + " ");
            }
            System.out.println("File program_21.txt created Succesfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create the file");
            e.printStackTrace();
        }
        }
    }
