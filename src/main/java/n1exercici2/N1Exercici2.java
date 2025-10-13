package n1exercici2;

import common_classes.ListFilesRecursive;

import java.io.File;

public class N1Exercici2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: please specify the directory path as an argument.");
            System.out.println("Please use: java n1exercici1.N1Exercici1 <directory_path>");
            return;
        }

        String dirPath = args[0];
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println(ListFilesRecursive.listFilesRecursive(directory, 0));
        } else {
            System.out.println("The directory doesn't exist or is not valid.");
        }

    }

}
