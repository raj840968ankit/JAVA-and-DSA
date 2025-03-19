import java.util.*;
public class myListIterator {
    public static void main(String[] args) {
            List<String> fruits= new ArrayList<>();
            fruits.add("apple"); 
            fruits.add("mango");        
            fruits.add("guava");    
            fruits.add("grapes");

            for(int i=0;i<fruits.size();i++){
                System.out.println(fruits.get(i));
            }

            for(String fruit:fruits){            //for each fruit in fruits
                System.out.println("for each fruit "+fruit);
            }

            //how to make subList

            List<String> subList= fruits.subList(0,3);
            System.out.println(subList);
    }
}
