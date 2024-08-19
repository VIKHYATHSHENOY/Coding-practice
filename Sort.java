public class Sort{
    public static void BubbleSort(int arr[]){
      for(int turns=0;turns<arr.length;turns++){
        for(int j=0;j<arr.length-turns-1;j++){
          if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
               arr[j+1]=temp;
          }
        }
      }
    }
    
    public static void SelectionSort(int arr[]){
      for(int i=0;i<=arr.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<=arr.length-1;j++){
              if(arr[minPos]>arr[j]){
                minPos=j;
              }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
      }
    }
    
    public static void printArr(int arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
   
     
    public static void main(String args[]){
      int arr[]={5,9,7,2,3,4};
      SelectionSort(arr);
      printArr(arr);
    }
  }
   
  