package finalKeywordUses;

import finalKeywordUses.model.Student;

public class FinalParameter {
    public void test(final int num){
        System.out.println(num);
    }


    public static void main(String[] args) {
        FinalParameter obj=new FinalParameter();
        obj.test(10);
    }
    // with reference
    public void update(final Student s){
    }
}
