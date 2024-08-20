import java.util.*;

public class VowelConsonentCount {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      
      
      str=str.toLowerCase();
      int vowelcount=0;
      int consonantcount=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          vowelcount++;
        }
        else{
          consonantcount++;
      }
  }
  System.out.println(vowelcount);
  System.out.print(consonantcount);

  
  sc.close();
}
}