package StringsCodeWithMik.Easy;

import java.util.LinkedHashMap;
import java.util.Map;
//Striver Playlist
public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map1 = new LinkedHashMap<>();
        Map<Character,Character> map2 = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2){
                    return false;
                }
            }
            else{
                map1.put(c1,c2);
            }
            if(map2.containsKey(c2)){
                if(map2.get(c2) != c1){
                    return false;
                }
            }
            else{
                map2.put(c2,c1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
