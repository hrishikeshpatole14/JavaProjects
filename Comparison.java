
import java.util.Scanner;

/* use comparison operator to find out whether a 
given number is greater than the user entered or
or not
 */

public class Comparison {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(number>8);
    }
}
