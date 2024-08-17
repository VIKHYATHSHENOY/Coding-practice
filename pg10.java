import java.util.Scanner;

public class pg10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int nthnum=fibo(n);
        System.out.println(n+"th term of the fibonacci series is"+nthnum);
}

    public static int fibo(int n){
         if(n<=0)
            return 0;
        else if(n==1)
              return 1;
        else
        {
            int a=0,b=1,c;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return b;
        }
    }
}