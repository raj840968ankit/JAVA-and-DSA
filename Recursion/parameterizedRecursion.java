package Recursion;

public class parameterizedRecursion {
    static int factorial(int i, int factorial){
        if(i == 0){
            return factorial;
        }
        return factorial(i-1 , factorial *i);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }
}
