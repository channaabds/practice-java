public class Test implements InfA{
    public String getName(){
        return "test-name";
    }
    public static void main (String[] args){
        Test t = new Test();
        System.out.println(t.getName());
    }
}