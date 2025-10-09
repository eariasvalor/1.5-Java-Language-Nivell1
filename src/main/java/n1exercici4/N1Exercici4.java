package n1exercici4;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class N1Exercici4 {
    public static void main(String[] args) {
        String filePath = (args.length > 0) ? args[0] : System.getProperty("user.dir") + File.separator + "Data" + File.separator + "result.txt";

        File file = new File(filePath);
        File directory = file.getParentFile();

        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory doesn't exist or is not valid: " + (directory != null ? directory.getPath() : "null"));
        }

        printResult(directory, file);
        readTxtFile(file);

    }

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

    private static String formatLastModified(long lastModifiedMillis) {
        LocalDateTime lastModified = LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifiedMillis), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return lastModified.format(formatter);
    }

    private static void printResult(File directory, File resultFile) {
        resultFile.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
            writer.write(listFilesRecursive(directory, 0).toString());
            System.out.println("Generated file: " + resultFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readTxtFile(File file) {
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
