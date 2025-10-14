package common_classes;

import n1exercici5.Worker;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializing {
    public static void serializeObject(Worker[] workers) {
        try {

            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("workers.txt"));
            writeFile.writeObject(workers);
            writeFile.close();

        } catch (Exception e) {
        }
    }
}
