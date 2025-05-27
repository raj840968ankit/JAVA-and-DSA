package Stack.MonotonicStack;
import java.util.*;

//copy, not monotonic stack problem

public class AsterioidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < asteroids.length; i++){
            //push the positive asteroids because its collision is dependent only on right -ve asteroids
            if(asteroids[i] > 0){
                list.add(asteroids[i]);
            }
            //if asteroids are negative
            else{
                //check and pop until abs(asteroids[i]) > list last elements
                while(!list.isEmpty() && ((list.get(list.size() - 1) > 0) && (list.get(list.size() - 1) < Math.abs(asteroids[i])))){
                    list.remove(list.size() - 1);
                }
                //if abs(asteroids[i]) == list last elements then destroy both
                if(!list.isEmpty() && (list.get(list.size() - 1) == Math.abs(asteroids[i]))){
                    list.remove(list.size() - 1);
                }
                //if list is empty or list only contain -ve asteroids then push asteroid
                else if(list.isEmpty() || (list.get(list.size() - 1) < 0)){
                    list.add(asteroids[i]);
                }
            } 
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] asteroids = {4, 7, 1, 1, 2, -3, -7, 17, 15, -18, -19};
        int[] res = asteroidCollision(asteroids);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
