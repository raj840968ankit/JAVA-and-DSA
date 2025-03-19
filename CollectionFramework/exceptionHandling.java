public class exceptionHandling {
    public static void main(String[] args) {
        int[] a= new int[5];
        System.out.println("Ankit");
        try{
            a[8]=5;
        } catch(Exception e){
            System.out.println("Exception handled is "+e.getMessage());
        }finally{
            System.out.println("I will run always");
        }
    }
}
