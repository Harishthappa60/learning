package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForwardListIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harish");
        names.add("Amit");
        names.add("Rahul");

        ListIterator<String>it=names.listIterator();
        System.out.println("Forward traversal");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
