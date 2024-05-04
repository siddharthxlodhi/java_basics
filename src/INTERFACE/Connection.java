package INTERFACE;

import java.sql.SQLException;

public interface Connection {
    public java.sql.Connection getconnection() throws SQLException;
    public void Closeconnection(Connection connection);
}
