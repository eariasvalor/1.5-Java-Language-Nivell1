package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class N1Exercici3 {
    public static void main(String[] args) throws IOException {
        String dirPath = args[0];
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            printResult(dirPath, directory);
        } else {
            System.out.println("Directory doesn't exist or is not valid.");
        }


    }

    public static StringBuilder listFilesRecursive(File directory, int level) {
        String indent = "  ".repeat(level);
        File[] files = directory.listFiles();
        StringBuilder answer = new StringBuilder();

        if (files != null) {
            for (File file : files) {
                String formattedDate = formatLastModified(file.lastModified());
                if (file.isDirectory()) {
                    answer.append(indent)
                            .append("D: ").append(file.getName())
                            .append(". Last modified: ").append(formattedDate)
                            .append("\n");
                    answer.append(listFilesRecursive(file, level + 1));
                } else {
                    answer.append(indent)
                            .append("F: ").append(file.getName())
                            .append(". Last modified: ").append(formattedDate)
                            .append("\n");
                }
            }
        }

        return answer;
    }

    private static String formatLastModified(long lastModifiedMillis) {
        LocalDateTime lastModified = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(lastModifiedMillis),
                ZoneId.systemDefault()
        );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return lastModified.format(formatter);
    }

    private static void printResult(String dirPath, File directory){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dirPath + "/result.txt"));
            writer.write(listFilesRecursive(directory, 0).toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

