package Strings;

public class UniqueChar {
    public static int uniquechar(String s){
        int[] count = new int[26];
        for(char c : s.toLowerCase().toCharArray()){
            count[c-'a']++;
        }
        int firstUniqueIndex = -1;
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(count[c-'a'] == 1){
                System.out.println("Unique Character "+s.charAt(i)+" Found at index "+ i);
                if(firstUniqueIndex == -1){
                    firstUniqueIndex = i;
                }
            }
        }
        return firstUniqueIndex;
    }
    public static void main(String[] args){
        String s = "Java";
        System.out.print(uniquechar(s));
    }
}
