package common_classes;

import n1exercici5.Worker;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializing {
    public static void deserializeObject(String filePath) {
        try {
            System.out.println("\n--- Deserializing objects from file: " + filePath + " ---");
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(filePath));
            Worker[] retrievedWorkers = (Worker[]) readFile.readObject();
            readFile.close();

            System.out.println("Objects successfully deserialized. Workers loaded:");
            for (Worker w : retrievedWorkers) {
                System.out.println(w);
            }
        } catch (Exception e) {

        }
    }
}
