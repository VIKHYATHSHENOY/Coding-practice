public class ReverseArr{
    public static void reverse(int arr[]){
      int first=0,last=arr.length-1;
      while(first<last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        first++;
        last--;
      }
    }
    public static void main(String args[]){
      int arr[]={5,9,7,2,3,4};
      reverse(arr);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
  }
   
   
  