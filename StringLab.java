public class StringLab {
    public static void main(String[] args){
        /// Task 1: Working with String Methods
        String Com = " Welcome to the Java String Lab! ";

        // For the last method result
        String test = "java string lab";

        int ComLength = Com.length();
        char ComInd = Com.charAt(7);
        String ComExt = Com.substring(16,20);
        String ComUp = Com.toUpperCase();
        String ComLow = Com.toLowerCase();
        int ComOcc = Com.indexOf("Java");
        boolean ComLab = Com.contains("Lab");
        String ComRep = Com.replace("Java", "Java Programming");
        String[] ComSplt = Com.split("");
        String ComTrim = Com.trim();
        boolean ComEq = Com.equals(test);
        boolean ComIg = Com.equalsIgnoreCase(test);
    

        // -----------------------------------------------------

        System.out.println("");
        System.out.println("Lab: Working with String Methods");
        System.out.println("----------------------");
        System.out.println("");

        // length();
        System.out.println("The length of the string is " + ComLength + ".");

        // charAt();
        System.out.println("The seventh index of the string is " + ComInd + ".");

        // substring();
        System.out.println("Extracting from the string, the result is [" + ComExt + "].");
    
        // toUpperCase();
        System.out.println("The uppercase version:" + ComUp);

        // toLowerCase();
        System.out.println("The lowercase version:" + ComLow);

        // indexOf();
        System.out.println("The first occurence of 'Java' can be found at index " + ComOcc + ".");

        // contains();
        System.out.println("Does the string contain 'Lab'? " + ComLab + ".");

        // replace();
        System.out.println(ComRep);

        // split();
        System.out.println("Printing each word:");
        for (String word : ComSplt) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // trim();
        System.out.println("The string without spaces:" + ComTrim);

        // equals(); and equalsIgnoreCase();
        System.out.println("Is 'java string lab' comparable to 'Welcome to Java String Lab'? " + ComEq);
        System.out.println("Is 'java string lab' comparable to 'Welcome to Java String Lab'? " + ComIg);


        /// Task 2: Loop Challenges with Strings



    }
}