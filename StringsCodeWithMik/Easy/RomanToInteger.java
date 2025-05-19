package StringsCodeWithMik.Easy;

import java.util.HashMap;
//Striver Playlist
public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0 ;i--){
            char s1 = s.charAt(i);
            char s2 = s.charAt(i+1);
            if(map.get(s1) < map.get(s2)){
                num -= map.get(s1);
            }
            else{
                num += map.get(s1);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
