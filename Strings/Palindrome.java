package Strings;
public class Palindrome {
     /*public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/
   // Without Regex
   public static boolean isPalindrome(String s){
    int left = 0;
    int right = s.length()-1;
    while (left < right ) {
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        left++;
        right--;
    }
    return true;
   }
    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
        if(isPalindrome(input1)){
            System.out.print(input1 + " is a palindrome");
        }
    }
}
