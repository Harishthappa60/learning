package cursors;

import java.util.Vector;

public class Enumeration {
    public static void main(String[] args) {
        Vector<String>names=new Vector<>();
        names.add("Harish");
        names.add("Amit");
        names.add("Rahul");

        java.util.Enumeration<String>en=names.elements();//get enumeration object
        System.out.println("Traversing Vector using enumeration");
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
