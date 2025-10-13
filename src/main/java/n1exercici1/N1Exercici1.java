package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class N1Exercici1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: please specify the directory path as an argument.");
            System.out.println("Please use: java n1exercici1.N1Exercici1 <directory_path>");
            return;
        }

        String dirPath = args[0];
        File directory = new File(dirPath);

        if (!directory.exists()) {
            System.out.println("Error: The specified directory doesn't exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("Error: the indicated path does not correspond to a directory.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Directory is empty or cannot be accessed.");
            return;
        }
        Arrays.sort(files, Comparator.comparing(file -> file.getName().toLowerCase()));
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
