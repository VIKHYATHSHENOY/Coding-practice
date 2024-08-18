
public class pg17{
    public static void main(String args[]){
      String originalString="Vikhyath";
      String reversedString=reverse(originalString);
      System.out.println(reversedString);
    }
    public static String reverse(String str){
      StringBuilder sb=new StringBuilder(str);
      return sb.reverse().toString();
    } 
  }
  