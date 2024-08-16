/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currencyconverter.interfaces;


import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ICurrencyDal {
    void updatePrice(String currencyCode, BigDecimal newPrice) throws SQLException;
    List<String> getCurrencyCodes() throws SQLException;
    ResultSet getAllCurrencies() throws SQLException;
    BigDecimal getConvertCurrencies(String code1, String code2) throws SQLException;
}
