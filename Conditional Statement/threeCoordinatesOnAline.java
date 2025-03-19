import java.util.Scanner;
public class threeCoordinatesOnAline {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter first coordinates of x and y:");
    int x1= sc.nextInt();
    int y1= sc.nextInt();
    System.out.println("enter second coordinates of x and y:");
    int x2= sc.nextInt();
    int y2= sc.nextInt();
    System.out.println("enter third coordinates of x and y:");
    int x3= sc.nextInt();
    int y3= sc.nextInt();
    int m1 = (y2-y1)/(x2-x1);
    int m2 = (y3-y2)/(x3-x2);
    if(m1==m2)
    {
        System.out.println("points lies on the straight line");
    }
    else
    {
        System.out.println("points lies on the straight line");
    }
    sc.close();
   } 
}
