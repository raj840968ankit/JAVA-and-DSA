package StringsCodeWithMik.Easy;

//leetcode 28
public class StringFirstIndexWordOccurance {
    public static int strStr(String haystack, String needle) {
        int firstIndex = -1;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                firstIndex = i;
                int j = 0;
                while(i < haystack.length() && j < needle.length()){
                    if(haystack.charAt(i) == needle.charAt(j)){
                        i++;
                        j++;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if(j == needle.length()){
                    return firstIndex;
                }
                else{
                    i = firstIndex;
                    firstIndex = -1;
                }
            }
        }
        return firstIndex;
    }
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}
