package StringsCodeWithMik.Easy;

public class RemoveOutermostParantheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count>1 && s.charAt(i)=='(') {
                sb.append(s.charAt(i));
            }
            if(count>0 && s.charAt(i)==')'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String para = "(()())(())";
        System.out.println(removeOuterParentheses(para));
    }
}
