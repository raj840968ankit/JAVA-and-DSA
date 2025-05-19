package StringsCodeWithMik.Easy;
//leetcode 1544

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length() - 1; i++){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            char min, max;
            if((int)ch1 < (int)ch2){
                min = ch1;
                max = ch2;
            }
            else{
                min = ch2;
                max = ch1;
            }
            
            if(((char)(min + 32) == max)){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                i = -1;
            }
        }
        return sb.toString();
    }    
    public static void main(String[] args) {
        String s = "abBAcC";
        String s2 = "leEeetcode";
        System.out.println(makeGood(s));
        System.out.println(makeGood(s2));
    }
}
