package Strings;

import java.util.Arrays;
/* -------------------Brute Force Approach ------------------------------------------------ */
public class Anagram {
  public static boolean valid(String s1 ,String s2 ){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ch = s1.toLowerCase().toCharArray();
        char[] ch1 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i = 0;i < s1.length();i++){
            if(ch[i] != ch1[i]){
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
