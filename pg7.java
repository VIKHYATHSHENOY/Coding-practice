import java.util.Scanner;

public class Main {
    
    public static boolean isPrime(int n){
      
      for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0)
            return false;
      }

      return true;
      
    }
    
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        if(N==1)
        {
          System.out.println("not prime");
        }
       else if(isPrime(N)){
              System.out.println(N+"Is is prime no");
        }
        else
          System.out.println(N+" Is not prime");
          
        scanner.close();
    }
}
