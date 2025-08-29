package exceptions.checked;

import static java.lang.Class.forName;

public class ClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("People");
        }catch (java.lang.ClassNotFoundException e){
            System.out.println("Caught ClassNotFound Exception "+e.getMessage());
        }
    }
}
