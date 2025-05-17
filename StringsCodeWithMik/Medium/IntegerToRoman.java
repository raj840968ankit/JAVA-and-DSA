package StringsCodeWithMik.Medium;

public class IntegerToRoman {
    //......Here instead of HashMap we are using array because hashmap is only suitable for particular value finding
    //......But we are working on number that can be anything('Array' preferred)

    public static String intToRoman(int num) {
        int[] numericVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanVal = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < numericVal.length; i++){
            if(num == 0) break;  //when num will become zero means nothing is remaining
            int romanValTimes = num / numericVal[i];
            while(romanValTimes != 0){
                sb.append(romanVal[i]);
                romanValTimes--;
            }
            num = num % numericVal[i];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }
}
