package Array;
import java.util.*;
public class twosum {
    // Brute Force Approach
   /*  public static int[] tsum(int[] arr, int target){
        for(int i=0; i<arr.length;i++ ){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target ){
                    System.out.println(arr[i]+arr[j]+" is found");
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }*/

    // Optimal Approach using Hashmap
    public static int[] tsum(int[] arr,int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }
        return new int[] {};

    }
    public static void main(String[] args) {
        int[] arr = {1,8,5,3,4,7};
        int target = 9;
        int[] result = tsum(arr, target);
        if(result.length > 0){
            System.out.print("Result found at "+result[0]+" "+result[1]);
        }
        else{
            System.out.println("Results not match ");
        }
    }
}
