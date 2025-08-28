package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("employee.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
