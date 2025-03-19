import java.util.Scanner;
public class areaOrPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and breadth:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area= l*b;
        int perimeter= 2*(l+b);
        System.out.println("area of rectangle : "+area);
        System.out.println("perimeter of rectangle : "+perimeter);
        if(area > perimeter)
        {
            System.out.println("Magnitude of area of Rect. is greater the magnitude of perimeter of Rect.");
        }
        else {
            System.out.println("Magnitude of perimeter of Rect. is greater the magnitude of area of Rect.");
        }
        sc.close();
    }
}
