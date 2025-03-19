import java.util.*;

public class comparableComparator {
    static class pair<K extends Comparable<K>,V extends Comparable<V>> implements Comparable<pair<K,V>>{
        K key;
        V value;
        pair(K k, V v){
            this.key=k;
            this.value=v;
        }
        public String toString(){
            return "pair { Key = "+key+", Value = "+value+" },\n";
        }
        public int compareTo(pair<K,V> that){
            if(this.key==that.key){
                return this.value.compareTo(that.value);
            }
            return this.key.compareTo(that.key);
        }
        public K getKey(){
            return key;
        }
    }
    static class sortKey<K extends Comparable<K>,V extends Comparable<V>> implements Comparator<pair<K,V>>{
        public int compare(pair<K,V> p1, pair<K,V> p2){
            if(p1.key==p2.key){
                return p2.value.compareTo(p1.value);
            }
            return p1.getKey().compareTo(p2.getKey());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<pair<Integer,Integer>> list= new ArrayList<>();
        for(int i = 0;i<4;i++){
            System.out.print("Enter key : ");
            int keY = sc.nextInt();
            System.out.print("Enter value : ");
            int Value= sc.nextInt();
            list.add(new pair<>(keY,Value));
        }
        System.out.println(list);
        Collections.sort(list,new sortKey<>());
        for(pair<Integer,Integer> it: list){
            System.out.print(it);
        }

        //or without making a separate class

        Collections.sort(list,new Comparator<pair<Integer,Integer>>() {
            public int compare(pair<Integer,Integer> p1, pair<Integer,Integer> p2){
                if(p1.key==p2.key){
                    return p2.value.compareTo(p1.value);
                }
                return p1.getKey().compareTo(p2.getKey());
            }
        });

        System.out.println(list);
        sc.close();
    }
}



