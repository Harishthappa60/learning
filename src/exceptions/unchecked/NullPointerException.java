package exceptions.unchecked;

import Encapsulation.model.Employee;

public class NullPointerException {
    public void nullFieldExample() {
        Employee em = null;
        System.out.println(em.getName());
    }
    public void nullArrayExample(){
        String[] arr=new String[3];//elements are null by default
        System.out.println(arr[0].length());//nullPointer exception
    }
    public static void main(String[] args) {
        NullPointerException obj=new NullPointerException();
        obj.nullFieldExample();
        obj.nullArrayExample();

        String name=null;
        System.out.println(name.length());

    }

}
