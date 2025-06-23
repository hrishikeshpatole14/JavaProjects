//convert km to miles

import java.util.Scanner;

public class Km2m {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the kilometers:");
    Double kilometers = sc.nextDouble();
    Double miles = (kilometers*0.621371);

    System.out.println("Converting km to mile");
    System.out.println(kilometers);
    System.out.println(miles);


    }
    
}
