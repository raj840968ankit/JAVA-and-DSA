package Graph.Representation;
import java.util.*;

public class GraphAdjacencyList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 3, m = 3; //?where n and m are vertices and edges respectively

        //!for n number of vertices always take n + 1 list size
        for(int i = 0; i < n + 1; i++){
            list.add(new ArrayList<>());
        }

        //edge 1 --- 3
        list.get(1).add(3);
        list.get(3).add(1);

        //edge 2 --- 3
        list.get(2).add(3);
        list.get(3).add(2);

        //edge 3 --- 1
        list.get(3).add(1);
        list.get(1).add(3);

        for(int i = 1; i <=n; i++){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.println(i + " -> " + list.get(i).get(j));
            }
        }
    }
}
