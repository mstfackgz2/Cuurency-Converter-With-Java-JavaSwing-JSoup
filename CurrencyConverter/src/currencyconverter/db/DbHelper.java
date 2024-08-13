package currencyconverter.db;
import java.sql.*;

public class DbHelper {
    private String userName = "root";
    private String password = "admin";
    private String dbUrl = "jdbc:mysql://localhost:3306/currencyconverter";
    
    public Connection getConnection () throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessages (SQLException e){
        System.out.println("Error: "+e.getMessage() );
        System.out.println("Code: "+e.getErrorCode());
    }



}
