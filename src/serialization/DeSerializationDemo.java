package serialization;

import collection.List.Arraylist.Employee;

import java.io.*;

public class DeSerializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee employee = (Employee) ois.readObject();
            Employee employee1 = (Employee) ois.readObject();

        } catch (IOException fne) {
            System.out.println("File not Found");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("object Class not found");
        }

       // At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword
    }
}
