import java.util.*;
public class myArrayList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();     // it means implementation of list using Arraylist/LinkedList
        List<Integer> list2= new ArrayList<>();
        list.add(1);        
        list.add(20);    
        list.add(30);
        list.add(1);
        list2.add(5);    
        list2.add(1);
        list2.add(7);    
        System.out.println(list);  //to print list
        System.out.println(list.size()); //to know ArrayList size
        System.out.println(list.contains(20)); //to know specified element is present or not...true or false
        list.remove(1);  //to remove the index value
        System.out.println(list);
        list.remove(Integer.valueOf(1));
        System.out.println(list);  //to remove a specified value from list
        list.addAll(list2);        //to add another list 
        System.out.println(list);
        list.removeAll(list2);     //to remove list2 and all intersections
        System.out.println(list);
        list.add(2);
        list.add(30);
        list.add(15);
        list2.add(2);
        list.retainAll(list2);     //to retain intersection of the given lists
        System.out.println(list);
        list.clear();   //to remove all elements of list
        System.out.println(list);

    }
}
