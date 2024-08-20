import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String originalString=sc.nextLine();
        String reversedString="";
        
        for(int i=originalString.length()-1;i>=0;i--){
              reversedString+=originalString.charAt(i);
        }
        System.out.println(reversedString);
        sc.close();
    }
}
