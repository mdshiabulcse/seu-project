package bd.edu.seu.javafxtablewithfile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {
       fileRead();
//        fileWrite();
//        readCSVFile();
    }
    public static void readCSVFile() {
        try {
            String fileLocation = "C:\\Users\\VEH-IT\\Downloads\\file2.csv";
            Path path= Paths.get(fileLocation);
            List<String> lines= Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void fileWrite() {
        String fileLocation = "C:\\Users\\VEH-IT\\Downloads\\file3.txt";
        Path path= Paths.get(fileLocation);
        String content = "hello i am shiabul islam";
        try {
            Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void fileRead() {
        String fileLocation = "C:\\Users\\VEH-IT\\Downloads\\file3.txt";
        Path path= Paths.get(fileLocation);
        try {
            List<String> fileContent= Files.readAllLines(path);
            for (String line : fileContent) {
                String[] words = line.split(",");
                for (String word : words) {
                    System.out.println(word);
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
