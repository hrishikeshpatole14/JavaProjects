

public class StringPractice {
    
public static void main(String[] args) {
    

 // convert string into lowercase   
 String name = "Jack  Parker";
 name = name.toLowerCase();
 System.out.println(name);

//replace spaces with underscore
 String text = "To Lower Case";
 text = text.replace(" ", "_");
 System.out.println(text);

// java pgm to fill in a letter template 
// which looks like below
// letter = "Dear<|name|>, Thanks a lot"
// replace <|name|> with a string(some name)
String letter = "Dear <|name|> , Thanks a lot!";
letter = letter.replace("<|name|>", "Harry");
System.out.println(letter);

// pgm to detect double and triple spaces in a string
String myString = "This string contains    Double and triple spaces";
System.out.println(myString.indexOf("  "));
System.out.println(myString.indexOf("   "));




}
}
