package cursors;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("harish");
        names.add("Sahil");
        names.add("Rohit");
        System.out.println("Before delete: "+names);
        //Get iterator from the list
        java.util.Iterator<String> it=names.iterator();
        System.out.println("Traversing using iterator  ..");
        while (it.hasNext()){// check if next element exists
            String name=it.next();
            System.out.println(name);
            if (name.equals("Sahil")){
                it.remove(); // safe delete
            }
        }
        System.out.println("After delete: "+names);
    }
}
