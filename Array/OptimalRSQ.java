package Array;

public class OptimalRSQ {
    static int[] buildPrefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    static int rangeSum(int[] prefix, int l, int r){
        if(l == 0) return prefix[r];
        return prefix[r] - prefix[l-1];
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,12,15,18};
        int[] prefix = buildPrefixSum(arr);
        System.out.println("Sum from 2 to 4 = "+ rangeSum(prefix, 2, 4));
    }
    
}
