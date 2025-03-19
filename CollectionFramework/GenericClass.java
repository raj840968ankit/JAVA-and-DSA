public class GenericClass {
    public static void main(String[] args) {
        ankit<String> obj=new ankit<>("2");
        ankit<String> obj2=new ankit<>("Ankit"); // single parameterized generic class obj declaration
        ankit<Integer> obj3=new ankit<>(2);
        System.out.println(obj.id+" "+obj2.id+" "+obj3.id);
        System.out.println(obj2.getid());

        cusat<Integer, String> cucek = new cusat<>(5,"ankit");  // double parameterized generic class obj declaration
        System.out.println(cucek.id()+" "+cucek.name());

    }
}
class ankit<E>{
    E id;
    public ankit(E id){
        this.id=id;
    }
    E getid(){
        return this.id;
    }
}
 
class cusat<E,V>{
    E id; 
    V name;
    public cusat(E id, V name){
        this.id=id;
        this.name=name;
    }
    E id(){
        return this.id;
    }
    V name(){
        return this.name;
    }
}
