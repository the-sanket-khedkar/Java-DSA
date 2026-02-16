package Strings;

public class Reverse {
    public static String Reverse(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(Reverse(input));
    }

}
