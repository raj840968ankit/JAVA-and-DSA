package StringsCodeWithMik.Medium;

import java.util.*;

//..........Without creating a pair class, sorting using comparator in list.................

public class WithoutPairClassSortCharacterByFrequency {
    public static String frequencySort(String s) {
        //mapping character with frequency
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        //sorting using comparator in list
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (ch1, ch2) -> { 
            return Integer.compare(map.get(ch2), map.get(ch1));
        });
        
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < map.get(list.get(i)); j++){
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
