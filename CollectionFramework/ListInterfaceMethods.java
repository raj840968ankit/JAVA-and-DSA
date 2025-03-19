import java.util.*;
public class ListInterfaceMethods {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);        
        list.add(20);    
        list.add(30);
        list.add(1);
        System.out.println(list.get(0));
        list.set(1, 200);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        System.out.println(list.indexOf(25));   //start checking with starting of list
        System.out.println(list.lastIndexOf(1)); //start checking with end of list
    }
}
