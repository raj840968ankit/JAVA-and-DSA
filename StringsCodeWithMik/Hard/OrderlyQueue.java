package StringsCodeWithMik.Hard;
//leetcode - 899
import java.util.Arrays;

public class OrderlyQueue {
    //Question description is in leetcode 899
    /*if we have freedom of swapping the characters for (k > 1) then we can solve the 
    problem by returning the sorted string only */
    public static String orderlyQueue(String s, int k) {
        if(k > 1){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }

        int n = s.length();
        String min = s;
        StringBuilder sb = new StringBuilder(s);

        //loop will run only (n - 1) times because n times will give the same input string
        //for (k = 1) i am rotating the string by taking 1st character and appending to last
        //and also comparing the string to find minimum string that follows lexicographically order
        for(int i = 1; i <= n - 1; i++){
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(sb.toString().substring(1));
            sb2.append(sb.charAt(0));
            if(sb2.toString().compareTo(min) < 0){
                min = sb2.toString();
            }
            sb = sb2;
        }
        return min;
    }
    public static void main(String[] args) {
        String s = "cba";
        int k = 1;
        System.out.println(orderlyQueue(s, k));
    }
}
