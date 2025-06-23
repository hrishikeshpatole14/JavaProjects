//solve the following expression

import java.util.Scanner;

public class Expression2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of v:");
        int v = sc.nextInt();
        System.out.println("Enter Value of u:");
        int u = sc.nextInt();
        System.out.println("Enter Value of a:");
        int a = sc.nextInt();
        System.out.println("Enter Value of s:");
        int s = sc.nextInt();

        float solution = (v*v)-(u*u)/(2*a*s);
        System.out.println("Solution is:"+solution);
        
    }
}
