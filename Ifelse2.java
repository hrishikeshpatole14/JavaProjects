
import java.util.Scanner;

public class Ifelse2 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        int marks = sc.nextInt();
        
    

        if(marks >=80 && marks<=100 )
        {
            
        System.out.println("yes buddy u got First class distinction");

        }
        else if (marks >=60 && marks<80)
        {
            System.out.println("yes buddy u got second class distinction");

        }
        else if(marks >=35 && marks<60)
       {
        System.out.println("yes buddy u got third class distinction");
       }
       
       else{
        System.out.println("buddy u got fails");
       }

     }
}
