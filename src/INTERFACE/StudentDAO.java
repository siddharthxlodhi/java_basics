package INTERFACE;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO implements BaseDAO {
    Connection connection= new MysqlConnection();

    @Override
    public void save(Object o) throws SQLException {
        StudentBean student = (StudentBean)o;
        java.sql.Connection c=connection.getconnection();
        String  sql="insert into st(id,name,branch,rollno) value(?,?,?,?)";
        PreparedStatement ps=c.prepareStatement(sql);

       ps.setInt(1,student.getId());
       ps.setNString(2,student.getName());
       ps.setNString(3,student.getBranch());
        ps.setNString(4,student.getRollno());
       ps.executeUpdate();
       connection.Closeconnection(connection);
    }

    @Override
    public void update (Object o) throws SQLException {
        StudentBean student = (StudentBean)o;
        if(student instanceof Updatable){
        java.sql.Connection c=connection.getconnection();
        String  sql="UPDATE st SET name = ?, branch = ?, rollno = ? WHERE id ="+student.getId();
        PreparedStatement ps=c.prepareStatement(sql);
        ps.setNString(1,student.getName());
        ps.setNString(2,student.getBranch());
        ps.setNString(3, student.getRollno());
        ps.executeUpdate();
      connection.Closeconnection(connection);}
        else {
            System.out.println("no");
        }

    }

    @Override
    public void delete(int id) throws SQLException {
        java.sql.Connection c=connection.getconnection();
        String sql="delete from st where id="+id;
        PreparedStatement ps=c.prepareStatement(sql);
        ps.executeUpdate();

    }
}
