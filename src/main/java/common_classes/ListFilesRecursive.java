package common_classes;

import java.io.File;

public class ListFilesRecursive {
    public static void listFilesRecursive(File directory, int level) {
        String indent = "  ".repeat(level);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                String formattedDate = FormatLastModified.formatLastModified(file.lastModified());
                if (file.isDirectory()) {
                    System.out.println(indent + "D: " + file.getName() + ". Last modified: " + formattedDate);
                    listFilesRecursive(file, level + 1);
                } else {
                    System.out.println(indent + "F: " + file.getName() + ". Last modified: " + formattedDate);
                }
            }
        }
    }
}
