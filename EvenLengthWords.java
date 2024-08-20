import java.util.*;

public class EvenLengthWords {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      
      String[] words=str.split(" ");
      
      for(String word: words){
        
        if(word.length()%2==0){
          System.out.println(word);
        }
      }
      
  sc.close();
}
}