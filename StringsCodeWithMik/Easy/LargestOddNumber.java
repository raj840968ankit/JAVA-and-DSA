package StringsCodeWithMik.Easy;

public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            int d= Integer.parseInt(String.valueOf(num.charAt(i)));
            if(d%2!=0){
                index=i;
                break;
            }
        }
        if(index==-1){
            return "";
        }
        return num.substring(0,index+1);
    }
    public static void main(String[] args) {
        String num = "12254";
        System.out.println(largestOddNumber(num));
    }
}
