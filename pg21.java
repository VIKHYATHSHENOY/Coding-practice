public class pg21 {
    public static void main(String[] args) {
    int num=12;
    int sum=sum(num);
    System.out.println(sum);
 }
    public static int sum(int n){
      int sum=0;
      while(n!=0){
        sum+=n%10;
        n=n/10;
      }
      return sum;
    }
} 
 
 
