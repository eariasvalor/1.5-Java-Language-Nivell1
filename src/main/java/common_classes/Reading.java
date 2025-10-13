package common_classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void readTxtFile(File file) {
        if (!file.exists()) {
            System.out.println("The file doesn't exist: " + file.getPath());
            return;
        }
        if (!file.isFile()) {
            System.out.println("The path doesn't correspond to any file: " + file.getPath());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\n--- Content of " + file.getName() + " ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
