
public class pg16{
    public static void main(String args[]){
      int n=5;
      for(int i=n;i>=1;i--)
      {
        //for spaces
        for(int j=1;j<=n-1;j++){
          System.out.print(" ");
        }
        //stars
        for(int k=1;k<=(2*i-1);k++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
  