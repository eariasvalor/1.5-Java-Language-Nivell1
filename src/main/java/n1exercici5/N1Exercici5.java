package n1exercici5;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class N1Exercici5 {
    public static void main(String[] args) {
        String filePath = (args.length > 0) ? args[0] : System.getProperty("user.dir") + File.separator + "Data" + File.separator + "result.txt";

        File file = new File(filePath);
        File directory = file.getParentFile();

        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory doesn't exist or is not valid: " + (directory != null ? directory.getPath() : "null"));
        }

        printResult(directory, file);
        readTxtFile(file);

        Worker worker1 = new Worker("John", 34);

        Worker[] workers = new Worker[3];

        workers[0] = worker1;
        workers[1] = new Worker("Mary", 26);
        workers[2] = new Worker("Peter", 65);

        serializeObject(workers);
        deserializeObject("workers.txt");

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

    public static void serializeObject(Worker[] workers) {
        try {

            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("workers.txt"));
            writeFile.writeObject(workers);
            writeFile.close();

        } catch (Exception e) {
        }
    }

    public static void deserializeObject(String filePath) {
        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(filePath));
            Worker[] retrievedWorkers = (Worker[]) readFile.readObject();
            readFile.close();
            for (Worker w : retrievedWorkers) {
                System.out.println(w);
            }
        } catch (Exception e) {

        }
    }

}






