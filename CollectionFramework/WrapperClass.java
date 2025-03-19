public class WrapperClass {
    public static void main(String[] args) {
        Integer b = Integer.valueOf(12);       //autoBoxing
        Integer c=12;                            //autoBoxing
        int d = c;                               //unboxing
        System.out.println(b+" "+c+" "+d+" ");
    }
}
