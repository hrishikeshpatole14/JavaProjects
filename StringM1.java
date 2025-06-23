

public class StringM1 {
    
    public static void main(String[] args) {
        String name = "Hrishi";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString = "     Hrishi     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace( 'r', 'p'));
        System.out.println(name.replace("shi", "ier"));

       System.out.println(name.startsWith("Hri"));
       System.out.println(name.endsWith("shi"));

       System.out.println(name.charAt(2));

       String modifiedName = "Hrishi";
       System.out.println(modifiedName.indexOf("r"));
       System.out.println(modifiedName.indexOf("shi", 4));
       System.out.println(modifiedName.lastIndexOf("shi", 4));

       System.out.println(name.equals("Hrishi"));
       System.out.println(name.equalsIgnoreCase("HRISHI"));

       System.out.println("I am Escape Sequence\" double quote");
       
        


    }
}


