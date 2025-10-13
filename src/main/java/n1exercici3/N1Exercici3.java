package n1exercici3;


import common_classes.Printer;


import java.io.File;

import java.io.IOException;


public class N1Exercici3 {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Error: please specify the directory path as an argument.");
            System.out.println("Please use: java n1exercici1.N1Exercici1 <directory_path>");
            return;
        }

        String dirPath = args[0];
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            Printer.printResult(dirPath, directory);
        } else {
            System.out.println("Directory doesn't exist or is not valid.");
        }


    }


}

