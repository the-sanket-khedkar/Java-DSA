package Strings;
// In this problem the code should count the number of vowels in a given string 
public class Vowels {
    public static int Count(String s){
        int count = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Leetcode and DSA in java";
        System.out.println("The number of vowels are " + Count(s));
    }
}
