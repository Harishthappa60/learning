package exceptions.checked;

import java.io.FileReader;;

public class FileNotFoundException {
    public static void main(String[] args) {
        String fileName = "C:/Workspace/learning/simple.txt";
        try {
            FileReader fr = new FileReader(fileName);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File Not Found " + e.getMessage());

        }
    }
}
