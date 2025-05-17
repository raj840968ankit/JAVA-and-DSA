package StringsCodeWithMik.Easy;

public class CountAndSay {
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String say = countAndSay(n - 1);

        StringBuilder result = new StringBuilder("");
        
        //counting the character and adding count first following character
        for(int i = 0; i < say.length(); i++){
            int count = 1;
            char ch = say.charAt(i);
            while((i + 1) < say.length() && ch == say.charAt(i+1)){
                count++;
                i++;
            }
            result.append(count);
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
