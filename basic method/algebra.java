
class add{
    int a;
    int b;
    add(int x,int y)
    {
        System.out.println("constructor of add class called");
        a=x; b=y;
    }

    int sum()
    {
        return a+b; 
    }
    int difference()
    {
        return a-b; 
    }int product()
    {
        return a*b; 
    }float division()
    {
        return (float)a/b; 
    }
}
public class algebra {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        add obj = new add(7,5);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        System.out.println("sum : "+obj.sum());
        System.out.println("sum : "+obj.difference());
        System.out.println("sum : "+obj.product());
        System.out.println("sum : "+obj.division());
        add obj2 = new add(11,5);
        System.out.println("sum : "+obj2.sum());
        System.out.println("sum : "+obj2.difference());
        System.out.println("sum : "+obj2.product());
        System.out.println("sum : "+obj2.division());
        //sc.close();
    }
}
