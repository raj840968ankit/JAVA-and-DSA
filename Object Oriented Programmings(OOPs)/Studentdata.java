class Student{
    int rollNo;
    String name;
}

public class Studentdata {
    public static void main(String[] args) {
        Student obj1= new Student();
        obj1.rollNo=1;
        obj1.name= "Dhoni";
        System.out.println(obj1.rollNo+"\n"+obj1.name);
        Student obj2= new Student();
        obj2.rollNo=2;
        obj2.name= "Virat";
        System.out.println(obj2.rollNo+"\n"+obj2.name);
    }
    
}
