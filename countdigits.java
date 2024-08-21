import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count=0;
        if(number==0){
          count=1;
        }
        else{
          while(number>0){
            number=number/10;
            count++;
          }
        }
        
        // Output the result
        System.out.println("The number of digits in " + number + " is: " + count);
        
        // Close the scanner
        scanner.close();
    }
}
