import java.util.*;
public class MinMax {
    // Find min and max
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The Array is ");
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        int min = arr[0];
        for(int i=1;i < n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("The maximum element is "+max);
        System.out.println("The minimum element is "+min);
        sc.close();
    }
}
