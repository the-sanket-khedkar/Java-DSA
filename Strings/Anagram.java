package Strings;

import java.util.Arrays;

public class Anagram {
  public static boolean valid(String s1 ,String s2 ){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();
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
