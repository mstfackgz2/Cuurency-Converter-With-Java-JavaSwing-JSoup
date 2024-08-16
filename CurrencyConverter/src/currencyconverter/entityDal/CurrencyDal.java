
package currencyconverter.entityDal;

import currencyconverter.db.DbHelper;
import currencyconverter.interfaces.ICurrencyDal;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;



public class CurrencyDal implements ICurrencyDal {

    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement preStatement = null;
    Statement statement = null;
    ResultSet resultSet;
    
    
    @Override
    public void updatePrice(String currencyCode, BigDecimal newPrice) throws SQLException{
        //update
        try {
            connection = helper.getConnection();
            String sql = "UPDATE currencies SET value = ? WHERE code = ?";
            preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, newPrice+"");
            preStatement.setString(2,currencyCode);
            int result = preStatement.executeUpdate();

        } catch (SQLException e) {
            helper.showErrorMessages(e);
        } finally {
            preStatement.close();
            connection.close();
        }
    }
    
    @Override
    public ArrayList<String> getCurrencyCodes() throws SQLException{
        ArrayList<String> codes = new ArrayList<String>();
        
        try {
            connection = helper.getConnection();
            String sql = "select * from currencies where typeid = 1 or typeid = 2 ";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                String code =resultSet.getString("code");
                codes.add(code);
            }
            
        } catch (SQLException e) {
            helper.showErrorMessages(e);
        } finally {
            connection.close();
            statement.close();
        }
    
    
        return codes;
    }   
    
    
    
    @Override
    public ResultSet getAllCurrencies() throws SQLException{
        
        try {
            connection = helper.getConnection();
            String sql = "SELECT c.name, c.code, ct.typename AS typeid, c.value FROM currencies c JOIN currencies_type ct ON c.typeid = ct.typeid;";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            helper.showErrorMessages(e);
        } 
        
        
        return resultSet;
    }
    

    @Override
    public BigDecimal getConvertCurrencies(String code1, String code2) throws SQLException {
    BigDecimal value = BigDecimal.ZERO;
    Connection connection = null;
    PreparedStatement preStatement = null;
    ResultSet resultSet = null;

    try {
        connection = helper.getConnection();
        String sql = 
            "SELECT (SELECT value FROM currencies WHERE code = ?)" +
            " / (SELECT value FROM currencies WHERE code = ?) AS currency_ratio";

        preStatement = connection.prepareStatement(sql);
        preStatement.setString(1, code1);
        preStatement.setString(2, code2);
        resultSet = preStatement.executeQuery();

        if (resultSet.next()) {
            value = resultSet.getBigDecimal("currency_ratio");
        }
    } catch (SQLException e) {
        helper.showErrorMessages(e);
    } finally {
            preStatement.close();
            connection.close();
            resultSet.close();
    }
    return value;
}

    
    

    
    
}
