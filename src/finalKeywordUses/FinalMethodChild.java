package finalKeywordUses;

public class FinalMethodChild extends FinalMethodParent {
    @Override
    public void demo1() {
        super.demo1();
        System.out.println("This method is from child class");
    }

    public static void main(String[] args) {
        FinalMethodChild obj=new FinalMethodChild();
        obj.demo1();
    }
}
