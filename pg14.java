import java.util.Arrays;
import java.util.Scanner;

public class pg14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces and convert strings to lower case for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
