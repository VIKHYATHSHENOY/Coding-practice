// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class pg3 {
    public static void main(String[] args) {
      String str="Vikhyath";
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(Character.isLowerCase(ch)){
              sb.append(Character.toUpperCase(ch));
          }
          else if(Character.isUpperCase(ch)){
              sb.append(Character.toLowerCase(ch));
          }
          else
              sb.append(ch);
          
      }
      System.out.println(sb.toString());
    }
}
