package Array;

public class Maxsubarray {
    // **************Brute Force Approach***********
    static int maxSubarray(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++ ){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Subarray Sum = "+ maxSubarray(arr));
    }
}
