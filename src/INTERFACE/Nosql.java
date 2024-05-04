package INTERFACE;

import java.sql.SQLException;

public class Nosql implements Connection {

    @Override
    public java.sql.Connection getconnection() throws SQLException {
        System.out.println("NoSQL connection established");
        return null;
    }

    @Override
    public void Closeconnection(Connection connection) {

    }
}
