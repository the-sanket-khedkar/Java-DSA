package Array;

import java.util.Arrays;

public class Reverse {
    // In this code we will reverse the given array
    public static void main(String[] args){
        int[] arr = {6,5,4,3,2,1}; //we'll take an already defined array
        System.out.println("Original Array "+Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
        System.out.println("Reversed Array "+Arrays.toString(arr));
    }
}
