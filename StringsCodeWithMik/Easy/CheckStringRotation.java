package StringsCodeWithMik.Easy;

public class CheckStringRotation {
    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        if(s.length()!=goal.length()){
            return false;
        }
        return sb.toString().contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        boolean ans = rotateString(s, goal);
        System.out.println(ans);
    }
}
