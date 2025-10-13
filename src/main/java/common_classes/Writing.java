package common_classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void printResult(File directory, File resultFile) {
        resultFile.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
            writer.write(ListFilesRecursive.listFilesRecursive(directory, 0).toString());
            System.out.println("Generated file: " + resultFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
