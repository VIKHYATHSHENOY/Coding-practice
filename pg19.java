public class pg19 {
    public static void main(String[] args) {
        String myString = "Hello, World!";
        int length=stringlength(myString);
        System.out.println(length);
    }
    public static int stringlength(String str){
      int length=0;
      for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
          if(c!=' '){
            length++;
          }
        
      }
      return length;
    }
}
