package StringsCodeWithMik.Easy;

public class MaximumNestingParanthesesDepth {
    public static int maxDepth(String s) {
        int count = 0, maxCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(str));
    }
}
