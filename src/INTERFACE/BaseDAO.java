package INTERFACE;

import java.sql.SQLException;

public interface BaseDAO {
    public void save(Object o) throws SQLException;
    public void update(Object o) throws SQLException;
    public void delete(int id) throws SQLException;
}