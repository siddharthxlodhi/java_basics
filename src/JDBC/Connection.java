package JDBC;

import collection.Map.PropertiesDemo;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connection {

    //Method1
    public java.sql.Connection getConnection(String url, String user, String password) throws SQLException {
       return DriverManager.getConnection(url,user,password);
    }
    //Method 2
    public java.sql.Connection getconnection(Properties properties) throws SQLException, IOException {
        try(java.sql.Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"))){
            System.out.println("Connection Established");
            return connection;
        }

    }


}
