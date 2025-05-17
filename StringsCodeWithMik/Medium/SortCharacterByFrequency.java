package StringsCodeWithMik.Medium;
import java.util.*;
class Pair {
    char ch;
    int freq;
    public Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    //when we try to print list when list contains any class's object
    public String toString(){
        return "[ char = "+this.ch+", freq = "+this.freq+" ]";
    }
    public char getChar(){
        return this.ch;
    }
    public int getFreq(){
        return this.freq;
    }
}
public class SortCharacterByFrequency {
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
        //adding class pair with char and freq in list
        List<Pair> list = new ArrayList<>();
        for(Character ch : map.keySet()){
            list.add(new Pair(ch, map.get(ch)));
        }
        //sorting object by frequency
        Collections.sort(list, new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return Integer.compare(b.freq, a.freq);
            }
        });
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < list.size(); i++){
            int count = 0;
            while(count < list.get(i).getFreq()){
                sb.append(list.get(i).getChar());
                count++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
