package StringsCodeWithMik;

public class stringCompression1 {
    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        StringBuilder sb = new StringBuilder("");
        sb.append(chars[0]);
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            while(i < chars.length && chars[i] == sb.charAt(sb.length() - 1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
            }
            if(i < chars.length){
                sb.append(chars[i]);
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
