package StringsCodeWithMik.Easy;
//leetcode 1832
public class stringPangram2 {
    //Question states that "a pangram is a sentence that contains every letter of alphabet at least once"
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = true;
        int[] letter = new int[26];  //hash array that will contain alphabet frequency
        for(int i = 0; i < sentence.length(); i++){
            int position = sentence.charAt(i) - 'a';
            letter[position] += 1;
        }
        for(int i = 0; i < letter.length; i++){
            if(letter[i] == 0){
                ans = false;
            }
        }
        System.out.println(ans);
    }
}

