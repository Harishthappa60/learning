package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOException extends Throwable {
    public static void main(String[] args) {
    String fileName="C:/Workspace/learning/simple.txt";
    try {

    FileReader fr=new FileReader(fileName);
        BufferedReader br=new BufferedReader(fr);
    String line;
    while ((line=br.readLine()) !=null){
        System.out.println(line);
    }
    br.close();
    fr.close();
    } catch (java.io.IOException e) {
        throw new RuntimeException("Error reading file"+e.getMessage());
    }
    }
}
