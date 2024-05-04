package collection.Map;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesDemo {

    public Connection getconnection() throws SQLException, IOException {
       Properties properties=PropertiesDemo.loadProperties();
       try(Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"))){
           System.out.println("Connection Established");
           return connection;
       }

    }

    public static Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        try( FileInputStream fis = new FileInputStream("C:\\Users\\Siddharth\\IdeaProjects\\java NEW\\src\\getProperties.properties")) {
            properties.load(fis);
            System.out.println("Properties Loaded");
        }
        return properties;
    }

    public static void main(String[] args){
        PropertiesDemo propertiesDemo=new PropertiesDemo();
        try {
            Connection connection=propertiesDemo.getconnection();
           PreparedStatement preparedStatement= connection.prepareStatement("insert into employee");
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Connection not found");
        } catch (IOException e) {
            System.out.println("Properties not loaded");
        }


    }
}
