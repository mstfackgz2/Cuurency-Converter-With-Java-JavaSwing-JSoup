<h1>Currency Converter</h1>
<p>
    The Currency Converter application is a Java-based desktop application designed to convert different currencies by fetching real-time exchange rates and storing them in a MySQL database. The application uses JSoup to scrape the exchange rate data and stores this data upon startup.
</p>

<h2>Project Structure</h2>
<ul>
    <li><strong>currencyconverter</strong>
        <ul>
            <li><strong>db</strong>
                <ul>
                    <li><strong>DbHelper.java</strong>: Contains the database connection logic and methods for database operations.</li>
                </ul>
            </li>
            <li><strong>entity</strong>
                <ul>
                    <li><strong>Currency.java</strong>: Represents the currency entity, with fields for currency code, name, and exchange rate.</li>
                </ul>
            </li>
            <li><strong>entityDal</strong>
                <ul>
                    <li><strong>CurrencyDal.java</strong>: Data access layer for the Currency entity, containing methods for CRUD operations.</li>
                </ul>
            </li>
            <li><strong>fetchers</strong>
                <ul>
                    <li><strong>CurrencyFetcher.java</strong>: Responsible for fetching currency data using JSoup and parsing it for storage in the database.</li>
                </ul>
            </li>
            <li><strong>ui</strong>
                <ul>
                    <li><strong>MainFrame.java</strong>: The main user interface of the application, responsible for displaying currency conversion options and results.</li>
                </ul>
            </li>
            <li><strong>uiController</strong>
                <ul>
                    <li><strong>MainPageController.java</strong>: Handles the logic for the main page UI, interacting with both the data and UI layers.</li>
                    <li><strong>CurrencyConverter.java</strong>: The entry point of the application, where the program begins execution.</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>

![output_gif](https://github.com/user-attachments/assets/63cba09f-9748-497b-8af1-79e8623a9db9)




