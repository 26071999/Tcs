import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileChanger {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String filePath=sc.nextLine();
        getNewFile(filePath);

    }

    private static void getNewFile(String filePath) throws IOException {
     FileReader fin=new FileReader(filePath);
     FileWriter fout=new FileWriter("abc.txt");
        System.out.println("Hello");

    }
}
