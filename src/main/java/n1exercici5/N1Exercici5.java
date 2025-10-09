package n1exercici5;

import java.io.*;

public class N1Exercici5 {
    public static void main (String[] args){
        Worker worker1 = new Worker("John", 34);

        Worker[] workers = new Worker[3];

        workers[0] = worker1;
        workers[1] = new Worker("Mary", 26);
        workers[2] = new Worker("Peter", 65);

        serializeObject(workers);
        deserializeObject("workers.txt");

    }

    public static void serializeObject(Worker[] workers){
        try {

            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("workers.txt"));
            writeFile.writeObject(workers);
            writeFile.close();

        } catch (Exception e) {
        }
    }

    public static void deserializeObject(String filePath){
        try{
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(filePath));
            Worker[] retrievedWorkers = (Worker[]) readFile.readObject();
            readFile.close();
            for (Worker w : retrievedWorkers){
                System.out.println(w);
            }
        } catch (Exception e){

        }
    }
}
