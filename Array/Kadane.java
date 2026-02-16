package Array;

public class Kadane {
    static int maxSubarray(int[] arr){
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax + arr[i]) {
                currentMax = arr[i];
                tempStart = i; // new subarray starts here
            } else {
                currentMax = currentMax + arr[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                start = tempStart;
                end = i;
            }
        }

        // Print the subarray
        System.out.print("Subarray with max sum: [");
        for (int k = start; k <= end; k++) {
            System.out.print(arr[k]);
            if (k < end) System.out.print(", ");
        }
        System.out.println("]");

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Subarray Sum = " + maxSubarray(arr));
    }
}
