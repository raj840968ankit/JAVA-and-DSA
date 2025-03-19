public class GenericMethod{

    public static void main(String[] args) {
        method(4,8);
        method(4.2,4);
        GenericMethod obj=new GenericMethod();
        obj.multiply(4.2,1.2);
    }
    static <E extends Number> void method(E a,E b){
        double sum= a.doubleValue()+ b.doubleValue();
        System.out.println(sum);
    }
    <Y extends Number> void multiply(Y a,Y b){
        double product= a.doubleValue()* b.doubleValue();
        System.out.println(product);
    }
}
