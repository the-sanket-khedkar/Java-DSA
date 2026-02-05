package Array;

public class Runningsum {
    // Running sum is a type of array problem in which a every element in an array is summed to all 
    // it's previous elements and then stored in another array
    public static void main(String[] args){
        // ************BRUTE FORCE APPROACH*************************************
            int[] arr={2,3,4,5,6};
            int[] runningsum = new int[arr.length];
            runningsum[0] = arr[0];
            System.out.print("The Original Array is ");
            for(int i=0;i<runningsum.length;i++){
                System.out.print(arr[i]+" ");
            }
            /*for(int i=0;i<arr.length;i++){
                int sum=0;
                for(int j=i;j>=0;j--){
                    sum += arr[j];
                }
                runningsum[i] = sum;
            }
            System.out.println("The new Array is ");
            for(int i=0;i<runningsum.length;i++){
                System.out.print(runningsum[i]+" ");
            }*/
           // *********************Optimal Approach********************
           for(int i=1;i<arr.length;i++){
                runningsum[i] = runningsum[i-1] + arr[i];
           }
           System.out.println("The new Array is ");
            for(int i=0;i<runningsum.length;i++){
                System.out.print(runningsum[i]+" ");
            }

    }
}
