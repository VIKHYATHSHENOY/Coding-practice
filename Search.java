public class Search{
    public static int linearSearch(int arr[],int key){
      for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
          return i;
        }
      }
      return -1;
    }
    public static int binarySearch(int arr[],int key){
      int start=0,end=arr.length-1,mid;
      while(start<=end){
        mid=(start+end)/2;
      
      if(arr[mid]==key){
          return mid;
      }
      if(arr[mid]<key){
        start=mid+1;
      }
      else{
        end=mid-1;
       }
      }  
      return -1;
    }
    public static void main(String args[]){
      int arr[]={5,9,7,2,3,4};
      int key=9;
      System.out.println("element found at"+linearSearch(arr,key));
    }
  }
   
   
  