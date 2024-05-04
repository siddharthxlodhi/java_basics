package InternalExceptionHandling.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryManyResource {
    public static void main(String[] args) {
        try(myClosable myClosable=new myClosable();myClosable2 myClosable2=new myClosable2();Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Sid@78989236")){

        } catch (SQLException e) {
            System.out.println("SQL");
        }

    }
}
