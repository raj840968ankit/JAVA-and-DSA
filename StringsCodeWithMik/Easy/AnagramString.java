package StringsCodeWithMik.Easy;

import java.util.Arrays;

public class AnagramString {
    public static boolean isAnagram(String s, String t) {
        char[] c1= s.toCharArray();
        char[] c2= t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length==c2.length){
            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
