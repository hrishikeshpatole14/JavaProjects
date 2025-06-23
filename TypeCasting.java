 // java pgm to encrypt a grade by adding 8 to it
 // decrypt it to show the correct grade.


public class TypeCasting {
    public static void main(String[] args) {
        
    char grade = 'B';
    grade = (char)(grade + 8);
    System.out.println(grade);


    // Decrypt the grade

    grade = (char)(grade - 8);
    System.out.println(grade);
    }
}
