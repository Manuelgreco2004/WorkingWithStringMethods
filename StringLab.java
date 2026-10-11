import java.util.Scanner;

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

        // For Loop
        int vowelCount = 0;
        String lowerCom = Com.toLowerCase();
        for (int i = 0; i < lowerCom.length(); i++) {
            char ch = lowerCom.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count in original string: " + vowelCount);
        
        /// While Loop
        String palindromeCandidate = "racecar";
        int left = 0;
        int right = palindromeCandidate.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (palindromeCandidate.charAt(left) != palindromeCandidate.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is \"" + palindromeCandidate + "\" a palindrome? " + isPalindrome);
        

        // Do...While Loop
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter a sentence containing the word 'Java': ");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");

        System.out.println("\n------------------------------------------\n");

        // ==========================================
        // Task 3: Working with StringBuilder
        // ==========================================
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        // "StringBuilder Lab - Learning Java" -> "Lab" ends at index 18
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        // "StringBuilder Lab is fun - Learning Java"
        int learnIndex = sb.indexOf("Learning");
        sb.delete(learnIndex, learnIndex + "Learning".length() + 1); // delete "Learning "
        sb.reverse();
        System.out.println("Task 3 (StringBuilder reversed): " + sb.toString());

        // ==========================================
        // Task 4: Working with StringBuffer
        // ==========================================
        StringBuffer sBuffer = new StringBuffer("Multithreading Lab");
        sBuffer.append(" - Learning Java");
        sBuffer.insert(sBuffer.indexOf("Lab") + 3, " is fun");
        int sfLearnIndex = sBuffer.indexOf("Learning");
        sBuffer.delete(sfLearnIndex, sfLearnIndex + "Learning".length() + 1);
        sBuffer.reverse();
        System.out.println("Task 4 (StringBuffer reversed): " + sBuffer.toString());
        
        scanner.close();
    }
}