package common_classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    public static void printResult(String dirPath, File directory) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dirPath + "/result.txt"));
            writer.write(ListFilesRecursive.listFilesRecursive(directory, 0).toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
