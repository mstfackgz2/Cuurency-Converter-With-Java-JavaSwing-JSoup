/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currencyconverter.uiController;

import java.sql.*;
import currencyconverter.entityDal.CurrencyDal;
import currencyconverter.fetchers.CurrencyFetcher;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author musta
 */
public class MainPageController {
    private CurrencyDal cd = new CurrencyDal();
    private ResultSet rs;
    
    public MainPageController(){
           
    }
    // bool degerler ile overload et!!
   public void fillTheTable(DefaultTableModel model, boolean money, boolean crypto) throws SQLException {
    rs = cd.getAllCurrencies();
    model.setRowCount(0);

    try {
        rs = cd.getAllCurrencies();

        while (rs.next()) {
            String name = rs.getString("name");
            String code = rs.getString("code");
            String type = rs.getString("typeid");
            String value = rs.getString("value");

            if (!crypto && type.equals("Crypto")) {
                continue;
            } else if (!money && type.equals("Money")) {
                continue;
            }

            model.addRow(new Object[]{name, code, type, value});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(new JFrame(), e);
    } finally {
        rs.close();
    }
}
   
   
   
    public void fillComboBox(JComboBox<String> converter_ComboBoxMain) throws SQLException {
        ArrayList<String> codes = cd.getCurrencyCodes();
        converter_ComboBoxMain.removeAllItems();
        for(String code: codes){
            converter_ComboBoxMain.addItem(code);
        }


    }
    
    public void converterButton(String count, String code1, String code2, javax.swing.JLabel converter_LabelResult) throws SQLException{
        BigDecimal countDecimal = new BigDecimal(count);
         BigDecimal conversionRate = cd.getConvertCurrencies(code1, code2);
         BigDecimal price = conversionRate.multiply(countDecimal);
         converter_LabelResult.setText(count + " " + code1 + " = " +price.toString()+ " " +code2);
    }
    
    
   public void setRealValueAll() throws SQLException{
       ArrayList<String> allCodes = cd.getCurrencyCodes();
       CurrencyFetcher cf = new CurrencyFetcher();
       BigDecimal newPrice = BigDecimal.ZERO;
       
       try {
            for(String code : allCodes){
            newPrice = cf.converter(code, "usd");
            cd.updatePrice(code, newPrice);
       }
       } catch (SQLException e) {
                   JOptionPane.showMessageDialog(new JFrame(), e);

       }

   
   }
          
    
}
