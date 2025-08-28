package cursors;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationWithHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> map =new Hashtable<>();
        map.put(1,"Harish");
        map.put(2,"Sohail");
        map.put(3,"John");

        Enumeration <Integer>en= map.keys();//enumerate keys
        System.out.println("Traversing Hashtable Keys");
        while (en.hasMoreElements()){
            Integer key=en.nextElement();
            System.out.println(key+"-> "+ map.get(key));
        }
    }
}
