package INTERFACE;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection implements Connection {
    @Override
    public java.sql.Connection getconnection() throws SQLException { System.out.println("CONNECTION ESTABLISHED");
        java.sql.Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Sid@78989236");
        return connection;
    }

    @Override
    public void Closeconnection(Connection connection) {


    }
}
