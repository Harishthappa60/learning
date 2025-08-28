package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardListIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harish");
        names.add("Amit");
        names.add("Rahul");

        ListIterator<String> it=names.listIterator(names.size());
        System.out.println("Backward Traversal");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
