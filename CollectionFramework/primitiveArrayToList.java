import java.util.*;
import java.util.stream.Collectors;
public class primitiveArrayToList {
    public static void main(String[] args) {
        int[][] a ={{1,2},{4,9},{2,13}};
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] a1,int[] a2){
                return Integer.compare(a1[0],a2[0]);
            }
        });
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ;i < a.length ;i++){
            list.add(Arrays.stream(a[i]).boxed().collect(Collectors.toList()));
        }
        // 2D list to 2D Array
        int[][] b = list.stream().map(innerList -> innerList.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        //2D array to 2D ArrayList
        List<List<Integer>> list2 = Arrays.stream(b).map(row -> Arrays.stream(row).boxed().collect(Collectors.toList())).collect(Collectors.toList()); 
        System.out.println(list+"\n"+list2);
        //list of array to 2d array
        List<int[]> list3 = new ArrayList<>();
        list3.add(a[0]);
        list3.add(a[1]);
        list3.add(a[2]);
        int[][] c = list3.stream().toArray(int[][]::new);
        for(int [] inner : c){
            System.out.println(Arrays.toString(inner));
        }
    }
}
