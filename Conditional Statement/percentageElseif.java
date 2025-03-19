import java.util.Scanner;
public class percentageElseif {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter percentage : ");
        float a = sc.nextFloat();
        if(a>100)
        {
            System.out.println("enter valid percentage");
        }
        else if(a>90 && a<=100)
        {
            System.out.println("Excellent");
        }
        else if (a>80 && a<=90)
        {
            System.out.println("Very Good");
        }
        else if (a>70 && a<=80)
        {
            System.out.println("Good");
        }
        else if (a>60 && a<=70)
        {
            System.out.println("Can do Better");
        }
        else if (a>50 && a<=60)
        {
            System.out.println("Average marks");
        }
        else if (a>40 && a<=50)
        {
            System.out.println("Below Average");
        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();
    }
}
