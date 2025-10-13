package n1exercici2;

import common_classes.ListFilesRecursive;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class N1Exercici2 {
    public static void main(String[] args) {
        String dirPath = args[0];
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            ListFilesRecursive.listFilesRecursive(directory, 0);
        } else {
            System.out.println("The directory doesn't exist or is not valid.");
        }

    }

}
