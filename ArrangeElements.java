import java.util.*;
public class ArrangeElements {
    public static void arrangeMinMax(int arr[], int n){
        boolean pointer=true;
        int result[]=new int[n];
        int start=0, end=n-1;
        for(int i=0; i<n; i++){
            if(pointer){
                result[i]=arr[end--];
            }else{
                result[i]=arr[start++];
            }
            pointer=!pointer;
        }
        for(int i=0; i<n; i++){
            arr[i]=result[i];
        }
    }
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
      System.out.println("Before Arranging Elements: ");
      printArray(arr, n);
      arrangeMinMax(arr, n);
      System.out.println("After Arranging Elements: ");
      printArray(arr, n);
    }
}