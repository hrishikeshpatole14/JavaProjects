
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
    System.out.println("Taking input from the user");
    Scanner sc = new Scanner(System.in);

    System.out.println("enter no 1");
    int a = sc.nextInt();
    System.out.println("enter no 2");
    int b = sc.nextInt();
   // boolean b1 = sc.hasNextInt();
   // System.out.println(b1);
    int sum = a+b;
    System.out.println("The sum of these numbers is");
    System.out.println(sum);
    
    String str1 = sc.next();   // prints only one word not full sentence
    System.out.println(str1); 
    String str2 = sc.nextLine(); // prints full sentence
    System.out.println(str2);


    }

}
