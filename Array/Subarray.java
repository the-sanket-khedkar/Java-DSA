package Array;
import java.util.*;
public class Subarray {
    static void subarrayOptimal(int[] arr, int target){
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++ ){
            prefixSum += arr[i];

            if(prefixSum == target){
                System.out.println("Subarray found from index 0 to " + i);
            }
            if(prefixMap.containsKey(prefixSum - target)){
                int start = prefixMap.get(prefixSum - target) + 1;
                System.out.println("Subarray found from index "+ start +" to "+i);
            }
            prefixMap.put(prefixSum,i);
        }
    }
    // ****************Brute Force Approach***************
   /*static void subarraySum(int[] arr, int target){
    int n = arr.length;
    for(int i = 0;i < n;i++){
        int sum = 0;
        for(int j = i;j < n; j++){
            sum += arr[j];
            if(sum == target){
                System.out.println("Subarray found from index "+ i +" to " + j);
            }
        }
    }
   }*/
   public static void main(String[] args){
    int[] arr={15,2,4,8,9,5,10,23};
    int target = 23;
    subarrayOptimal(arr, target);
    //subarraySum(arr, target);
   }   
}
