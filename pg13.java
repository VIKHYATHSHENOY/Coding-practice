import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the smallest and largest elements in the array
        int smallest = findSmallest(array);
        int largest = findLargest(array);

        System.out.println("The smallest element in the array is: " + smallest);
        System.out.println("The largest element in the array is: " + largest);

        scanner.close();
    }

    // Method to find the smallest element in the array
    public static int findSmallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // Method to find the largest element in the array
    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
