import java.util.*;
public class name{
    public static void myName(String name) {
        System.out.println("Name is "+name);
        return;
    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Name :");
    String name = sc.nextLine();
    myName(name);
    sc.close();
 }
}