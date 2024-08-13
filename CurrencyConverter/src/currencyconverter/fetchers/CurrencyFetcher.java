
package currencyconverter.fetchers;

import currencyconverter.entityDal.CurrencyDal;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CurrencyFetcher {
    private ArrayList<String> ourMoneys = null;
    
    public CurrencyFetcher() throws SQLException{
        setOurMoney();
    }
    
     private void setOurMoney() throws SQLException {
         CurrencyDal cd = new CurrencyDal();
         ourMoneys = cd.getCurrencyCodes();
     
     }
    
    
public BigDecimal converter(String code1, String code2) {
    code1 = code1.toUpperCase();
    code2 = code2.toUpperCase();
    BigDecimal result = BigDecimal.ZERO;
    String url = "https://www.xe.com/currencyconverter/convert/?Amount=1&From=" + code1 + "&To=" + code2;

    if (ourMoneys.contains(code1) && ourMoneys.contains(code2)) {
        try {
            Document doc = Jsoup.connect(url).get();
            String value = doc.select("p.sc-e08d6cef-1").text();
            value = value.substring(0, value.indexOf(" "));

            if (value.contains(",") && value.contains(".")) {
                value = value.replace(",", "");
            } else if (value.contains(",")) {
                value = value.replace(",", ".");
            }

            result = new BigDecimal(value);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conversion failed: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(new JFrame(), "We don't have money like that");
    }

    return result.setScale(10, RoundingMode.UNNECESSARY); 
}

    
    
}
