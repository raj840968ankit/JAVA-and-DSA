class array{
    void _1_D_Array()
    {
        int a[]= new int[3];
        a[0]=1;
        a[1]=3;
        a[2]=4;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    void _2_D_Array()
    {
        String names[]=new String[3];
        names[0]="papa";
        names[1]="mummy";
        names[2]="beta";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
public class basic{
    public static void main(String argv[])
    {
        array obj = new array();
        obj._1_D_Array();
        obj._2_D_Array();
    }

}