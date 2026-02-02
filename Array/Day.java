package Array;
import java.util.*;
class Day{
    // Java Arrays Revision with travesral and input 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++ ){
             arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0;i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        sum(n,arr);
        sc.close();
        
    }
    public static void sum(int n,int[] arr){
        int sum = 0;
        System.out.println();
        for(int i = 0;i < n; i++){
            sum += arr[i];
        }
        System.out.println("Sum is "+sum);
    }
}