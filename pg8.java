import java.util.Scanner;

public class pg8 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        if(isPallindrome(N))
          System.out.println("Pallindrome");
        else
          System.out.println("Not Pallindrome");
        scanner.close();
    }
    
    public static boolean isPallindrome(int n){
      
      int originalNumber=n;
      int reversedNumber=0;
      while(n!=0){
        int digit=n%10;
        reversedNumber=reversedNumber*10+digit;
        n/=10;
      }
      return originalNumber==reversedNumber;
    }
    
}
