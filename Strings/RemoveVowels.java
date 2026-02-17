package Strings;
import java.util.*;
public class RemoveVowels {
    public static String Remove(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "Leetcode and java";
        System.out.println(Remove(s));
    }
}
