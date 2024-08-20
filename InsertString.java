import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        
        System.out.print("Enter the string to be inserted: ");
        String stringToBeInserted = scanner.nextLine();
        
        System.out.print("Enter the index where the string should be inserted: ");
        int index = scanner.nextInt();
        
        // Check if the index is within the valid range
        if (index < 0 || index > originalString.length()) {
            System.out.println("Invalid index. Please enter a valid index.");
        } else {
            // Create the new string by inserting the second string into the first string
            String result = originalString.substring(0, index) + stringToBeInserted + originalString.substring(index);
            
            System.out.println("Resulting string: " + result);
        }
        
        scanner.close();
    }
}

