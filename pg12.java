import java.util.Scanner;

public class pg12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int n2= scanner.nextInt();
        int gcd=findGcd(n1,n2);
        System.out.println("GCD of two nos "+gcd);
        int lcm=findlcm(n1,n2);
        System.out.println("LCM of two nos "+lcm);
        scanner.close();
    }

    // Method to print Fibonacci series up to n terms
    public static int findGcd(int a,int b) {
      
      while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
      }
      return a;
}

   public static int findlcm(int a, int b){
      int gcd=findGcd(a,b);
      return Math.abs(a*b) / gcd;
     
   }
}
