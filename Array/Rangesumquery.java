package Array;

public class Rangesumquery {
        int rangesum(int[] arr, int i,int j){
            int sum = 0;
            for(int k = i;k <=j; k++){
                sum += arr[k];
            }
            return sum;
        }
    public static void main(String[] args){
        int[] arr ={2,4,6,12,15,18};
        Rangesumquery obj = new Rangesumquery();
        int k = obj.rangesum(arr, 2, 4);
        System.out.println("Sum = "+k);
    }
}
