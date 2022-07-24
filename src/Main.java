import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        B b=new B() ;
        Connection con= b.connect() ;
        String sqlSelectR = "Select * FROM sallereserve ";
        java.sql.PreparedStatement p = con.prepareStatement(sqlSelectR);
        ResultSet resultR = p.executeQuery();
        while (resultR.next()){
            System.out.println(resultR.getArray(1));
        }
    }
}
