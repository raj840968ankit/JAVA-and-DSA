import java.util.*;
public class Set_Uses {
    public static void main(String[] args) {
        //HashSet
        Set<Integer> hashset= new HashSet<>();  //random order because internal hash code is generated
        hashset.add(10);    
        hashset.add(20);
        hashset.add(10);   //don't allow duplicates
        System.out.println(hashset); 
        
        //LinkedHashSet
        Set<Integer> linkedhashset= new LinkedHashSet<>();  //ordered same as order of insertion
        linkedhashset.add(30);    
        linkedhashset.add(20);
        linkedhashset.add(10);  //don't allow duplicates
        System.out.println(linkedhashset); 

        //TreeSet
        Set<Integer> treeset= new TreeSet<>();  //Uses BST and inOrder traversal
        treeset.add(10);    
        treeset.add(20);
        treeset.add(15);  //don't allow duplicates
        System.out.println(treeset); 
    }

    @Override
    public String toString() {
        return "Set_Uses []";
    }
}
