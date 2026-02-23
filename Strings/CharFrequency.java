package Strings;

public class CharFrequency {
    public static void frequency(String s){
        int[] count = new int[26];
        for(char c: s.toLowerCase().toCharArray()){// added the characters of string into the array 
            count[c - 'a']++;
        }
        for(int i = 0;i < count.length;i++){
            if(count[i] > 0){
                System.out.println((char)(i+'a')+" : "+count[i]);
            }
        }
    }
    public static void main(String[] args){
        String s = "Characters";
        frequency(s);
    }
}
