package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ModifyListIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harish");
        names.add("Amit");
        names.add("Rahul");
        System.out.println("Before modify: "+names);

        ListIterator<String> it=names.listIterator();
        System.out.println(" After Modify ");
        while (it.hasNext()){
            String name=it.next();
            if(name.equals("Amit")){
                it.set("Amit Kumar");
            }
            if (name.equals("Rahul")){
                it.add("John");
            }
        }
        System.out.println(names);
    }
}
