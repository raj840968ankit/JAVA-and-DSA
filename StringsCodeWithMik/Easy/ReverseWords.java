package StringsCodeWithMik.Easy;

public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder sb= new StringBuilder("");
        int fc=s.length()-1;
        int lc=s.length()-1;
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            lc=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            fc=i+1;
            sb.append(s.substring(fc,lc+1)+" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
