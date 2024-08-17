import java.util.*;

public class pg4 {
    public static void main(String[] args) {
      String str="viiiik";
      int vovelCount=0;
      str=str.toLowerCase();
      for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          vovelCount++;
        }
      }
      System.out.println(vovelCount);
  }
}
