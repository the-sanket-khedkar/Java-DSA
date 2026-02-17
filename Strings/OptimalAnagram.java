package Strings;

public class OptimalAnagram {
    public static boolean valid(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[26];
        for(char c : s1.toLowerCase().toCharArray()){
            count[c - 'a']++;
        }
        for(char c : s2.toLowerCase().toCharArray()){
            count[c - 'a']--;
        }
        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Anagram";
        String s2 = "Nagaram";
        System.out.println(valid(s1, s2));
    }
}
