package n1exercici4;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class N1Exercici4 {
    public static void main(String[] args) {
        String dirPath = (args.length > 0) ? args[0] : System.getProperty("user.dir") + File.separator + "Data";
        String fileName = "";

        if (args.length > 0) {
            dirPath = args[0];
        }

        if (args.length > 1) {
            fileName = args[1];
        }

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            //printResult(dirPath, directory);
            readTxtFile(dirPath, fileName);
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

    private static void printResult(String dirPath, File directory) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dirPath + "/result.txt"));
            writer.write(listFilesRecursive(directory, 0).toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readTxtFile(String dirPath, String fileName) {
        String resultFilePath = dirPath + File.separator + fileName;
        File file = new File(resultFilePath);

        if(!file.exists()) {
            System.out.println("The file doesn't exist: " + file.getPath());
            return;
        }
        if(!file.isFile()) {
            System.out.println("The path doesn't match with a file: " + file.getPath());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
