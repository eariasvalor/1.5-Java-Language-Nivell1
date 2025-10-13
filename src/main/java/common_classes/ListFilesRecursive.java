package common_classes;

import java.io.File;

import static common_classes.FormatLastModified.formatLastModified;

public class ListFilesRecursive {
    public static StringBuilder listFilesRecursive(File directory, int level) {
        String indent = "  ".repeat(level);
        File[] files = directory.listFiles();
        StringBuilder answer = new StringBuilder();

        if (files != null) {
            for (File file : files) {
                String formattedDate = formatLastModified(file.lastModified());
                if (file.isDirectory()) {
                    answer.append(indent).append("D: ").append(file.getName()).append(". Last modified: ").append(formattedDate).append("\n");
                    answer.append(listFilesRecursive(file, level + 1));
                } else {
                    answer.append(indent).append("F: ").append(file.getName()).append(". Last modified: ").append(formattedDate).append("\n");
                }
            }
        }

        return answer;
    }
}
