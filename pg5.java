import java.util.*;

public class pg5 {
    
    public static String removeAlphabets(String str){
      StringBuilder sb=new StringBuilder();
      
      for(char ch:str.toCharArray())
      {
        if(Character.isLetter(ch))
            sb.append(ch);
      }
      return sb.toString();
    }
   
    public static void main(String[] args){
      
      String str="vikhyath@1234";
      System.out.println(removeAlphabets(str));
      
  }
}