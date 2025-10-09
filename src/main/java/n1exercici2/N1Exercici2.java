package n1exercici2;

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
            listFilesRecursive(directory, 0);
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }

    }

    public static void listFilesRecursive(File directory, int level) {
        String indent = "  ".repeat(level);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                String formattedDate = formatLastModified(file.lastModified());
                if (file.isDirectory()) {
                    System.out.println(indent + "D: " + file.getName() + ". Last modified: " + formattedDate);
                    listFilesRecursive(file, level + 1);
                } else {
                    System.out.println(indent + "F: " + file.getName() + ". Last modified: " + formattedDate);
                }
            }
        }
    }

    private static String formatLastModified(long lastModifiedMillis) {
        LocalDateTime lastModified = LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifiedMillis), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return lastModified.format(formatter);
    }
}
