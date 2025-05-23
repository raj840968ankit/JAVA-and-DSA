package StringsCodeWithMik.Easy;

//Striver Playlist
public class AnagramString {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alphabets = new int[26];
        //taking s string character and incrementing its value in hash array
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            alphabets[ch - 'a']++;
        }

        //taking t string character and decrementing it's value in hash array
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            alphabets[ch - 'a']--;
        }

        //checking hash array if it contains only 0 value then both strings are anagram
        for(int i = 0; i < alphabets.length; i++){
            if(alphabets[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
