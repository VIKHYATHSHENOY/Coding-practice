import java.util.ArrayLists;
public class Stack1{
  public class Stack{
    static ArrayLists<Integer> list= new ArrayLists<>();
    
    //Is empty
    public static Boolean isEmpty(){
      return list.size()==0;
    }
    //Push
    public static void push(int data){
        list.add(data);
    }
    //Pop 
    public static int pop(int data){
      int top=list.get(list.size()-1);
      list.remove(list.size()-1);
      return top;
    }
    //peek
    public static int peek(){
      return list.get(list.size()-1);
    }
  }
  public static void main(String args[]){
    Stack s= new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isEmpty){
      System.out.println(s.peek());
      s.pop()
    }
  }
}
 
 
