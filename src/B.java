import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B implements I{
    @Override
    public void x() {
        System.out.println("im B");
    }
    public String url = "jdbc:mysql://localhost:3306/ensa";
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,"root","");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
