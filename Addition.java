
import java.util.Scanner;

  class Addition{
    public static void main(String[] args) {
      int a , b , sum;
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a:");
       a = sc.nextInt();
        System.out.println("enter the value for b:");
        b = sc.nextInt();
    
      sum = a+b;
      System.out.println("Sum is:"+sum);
      
    }
  }