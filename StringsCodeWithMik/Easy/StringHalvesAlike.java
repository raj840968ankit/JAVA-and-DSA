package StringsCodeWithMik.Easy;
//leetcode 1704

public class StringHalvesAlike {
    //Question states that number of vowels should be same in both halves of even length string
    public static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int pointer1 = 0;     //points starting of 1st half
        int pointer2  = s.length() / 2;   //points starting of second half
        int vowelCount1 = 0;
        int vowelCount2 = 0;
        for(int i = 0; i < pointer2 ; i++){
            if(vowels.contains(String.valueOf(s.charAt(pointer1+i)))){
                vowelCount1++;
            }
            if(vowels.contains(String.valueOf(s.charAt(pointer2+i)))){
                vowelCount2++;
            }
        }
        return vowelCount1 == vowelCount2 ? true : false;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
        String s2 = "textbook";
        System.out.println(halvesAreAlike(s2));
    }
}
