package serialization;

import collection.List.Arraylist.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args)  {
        //Creating object of Employee
        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n3", 20, "12300", 51000.00);
        try {
            //Writing data to a file
            FileOutputStream fos = new FileOutputStream("ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //how to serialize

            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.close();
            fos.close();
            System.out.println("Object stated is transferred to file ob");
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
