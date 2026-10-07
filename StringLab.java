public class StringLab {
    public static void main(String[] args){
        // Task 1: Working with String Methods
        String Com = " Welcome to the Java String Lab! ";

        int ComLength = Com.length();
        char ComInd = Com.charAt(7);
        String ComExt = Com.substring(16,20);

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
    
    }
}