public class accessModifier {
    public String str = "i am a class member";          // accessible everywhere
    // protected String str = "i am a class member";    //within package all accessible outside only child of parent class can access
    // private String str = "i am a class member";      //only accessible within class 
    // String str = "i am a class member";              //default can access only in same package
    void withinClass()
    {
        System.out.println("within class : "+str);
    }
    public static void main(String[] args) {
        accessModifier obj = new accessModifier();
        obj.withinClass();
        System.out.println("within class : "+obj.str);
        app2 obj2= new app2();
       obj2.outsideClass();
       app3 obj3= new app3();
       obj3.childOfAppClass();
    }
}
class app2{
    void outsideClass()
    {
        accessModifier obj = new accessModifier();
        System.out.println("outside class : "+obj.str);
    }
}
class app3 extends accessModifier{
    void childOfAppClass(){
        app3 obj3 = new app3();
        System.out.println("child class of app : "+obj3.str);
    }

}

