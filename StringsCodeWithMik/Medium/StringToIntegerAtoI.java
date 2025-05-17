package StringsCodeWithMik.Medium;

public class StringToIntegerAtoI {
    public static int myAtoi(String s) {
        boolean negative = false;
        long num = 0;
        int i = 0, n = s.length();
        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle optional '+' or '-'
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }
        
        while(i < n){
            //taking integer value of character and adding it to num
            int charDigit = s.charAt(i) - '0';
            if(charDigit >= 0 && charDigit <= 9){
                num = num * 10 + charDigit;
                if(num > Integer.MAX_VALUE){
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
            else{
                break;
            }
            i++;
        }
         
        return negative ? (int)-num : (int)num;
    }
    public static void main(String[] args) {
        String s = "  -01337c0d3";
        System.out.println(myAtoi(s));
    }
}
