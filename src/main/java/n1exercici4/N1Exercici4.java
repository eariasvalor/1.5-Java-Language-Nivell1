package n1exercici4;

import common_classes.Reading;
import common_classes.Writing;

import java.io.*;


public class N1Exercici4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: please specify the directory path as an argument.");
            System.out.println("Please use: java n1exercici1.N1Exercici1 <directory_path>");
            return;
        }

        String filePath = (args.length > 0) ? args[0] : System.getProperty("user.dir") + File.separator + "Data" + File.separator + "result.txt";

        File file = new File(filePath);
        File directory = file.getParentFile();

        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory doesn't exist or is not valid: " + (directory != null ? directory.getPath() : "null"));
        }

        Writing.printResult(directory, file);
        Reading.readTxtFile(file);

    }
}
