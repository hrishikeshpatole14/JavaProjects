// calculate the cgp of three subjects marks out of 100

import java.util.Scanner;

public class Cgp {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter marks of sub1:");
   float sub1 = sc.nextFloat();

   System.out.println("Enter marks of sub2:");
   float sub2 = sc.nextFloat();

   System.out.println("Enter marks of sub3:");
   float sub3 = sc.nextFloat();

   float cgpa = (sub1+sub2+sub3)/30;

System.out.println("Your Cgpa is:");
System.out.println(cgpa);



    }
    
}
