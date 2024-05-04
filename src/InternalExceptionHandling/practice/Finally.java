package InternalExceptionHandling.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Finally {
     static Connection connection = null;

    public static void Operation(){
        try {
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/finally","root","Sid@78989236");
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println("there is an exception");

        } finally {
          Finally.closeHandle();
        }
    }
    public static void closeHandle(){
try {
    Finally.closetimestamp();
    connection.close();
    System.out.println("Connection Closed");
}catch (SQLException sqlException){
    System.out.println("there is an exception");
}

    }

    public static void closetimestamp() throws SQLException {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO close (closed) VALUES (?)");
            LocalDateTime currentTimestamp = LocalDateTime.now();
            preparedStatement.setObject(1, currentTimestamp);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) affected.");


    }
    public static void main(String[] args){
        Finally.Operation();

        }

    }

