package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class N1Exercici1 {
    public static void main(String[] args) {
        String dirPath = args[0];
        File directory = new File(dirPath);

        File[] files = directory.listFiles();
        Arrays.sort(files, Comparator.comparing(file -> file.getName().toLowerCase()));

        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
