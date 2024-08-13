package currencyconverter;

import currencyconverter.ui.MainFrame;
import java.sql.SQLException;

/**
 *
 * @author musta
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
            // set real time value first
//            CurrencyFetcher cf = new CurrencyFetcher();
//            System.out.println(""+cf.converter("btc", "usd"));
            MainFrame mp = new MainFrame();
            mp.setVisible(true);
                
        }
    
}
