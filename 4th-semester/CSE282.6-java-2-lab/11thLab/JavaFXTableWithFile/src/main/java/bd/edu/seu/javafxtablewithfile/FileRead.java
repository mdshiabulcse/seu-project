package bd.edu.seu.javafxtablewithfile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {
       //fileRead();
        //fileWrite();
        readCSVFile();
    }
    public static void readCSVFile() {
        try {
            String fileLocation = "";
            Path path= Paths.get(fileLocation);
            List<String> lines= Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
