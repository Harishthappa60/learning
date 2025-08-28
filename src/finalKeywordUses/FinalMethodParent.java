package finalKeywordUses;

public class FinalMethodParent{

    private final void demo(){
        System.out.println("Hello world");
    }
    public void demo1(){
        System.out.println("method from parent class");
    }

    public static void main(String[] args) {
        FinalMethodParent obj =new FinalMethodParent();
        obj.demo1();

    }

}
