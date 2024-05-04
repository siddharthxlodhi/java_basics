package INTERFACE;

import java.sql.SQLException;

public class nosqlStudentDAO implements BaseDAO{
    Connection connection=new Nosql();
    @Override
    public void save(Object o) throws SQLException {
        java.sql.Connection c=connection.getconnection();
        System.out.println("saved");

    }

    @Override
    public void update(Object o) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }
}
