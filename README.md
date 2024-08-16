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
</ul><br><br>
<h2>Future Updates</h2>

<ul>
    <li>User Authentication: A login page will be added to provide secure access to the application.</li>
    <li>Role-Based Access: Dedicated pages will be created for Admins and Users, offering tailored functionalities for each role.</li>
    <li>Threading Implementation: The application will incorporate threading to improve performance and handle concurrent processes efficiently.</li>
   <li><strong>Enhanced Object-Oriented Design</strong>: Inheritance will be utilized to promote code reusability and maintain a scalable, clean architecture.</li>
</ul><br><br><br><br>
<hr>
<div style="text-align: center; font-size: 24px; font-weight: bold;">
    TR
</div>
<hr>
<h1>Para Birimi Dönüştürücü</h1>
<p>
    Para Birimi Dönüştürücü uygulaması, farklı para birimlerini dönüştürmek için gerçek zamanlı döviz kurlarını çeken ve bunları bir MySQL veritabanında saklayan Java tabanlı bir masaüstü uygulamasıdır. Uygulama, JSoup'u kullanarak döviz kuru verilerini çekmekte ve bu verileri uygulama başlatıldığında saklamaktadır.
</p>

<h2>Proje Yapısı</h2>
<ul>
    <li><strong>currencyconverter</strong>
        <ul>
            <li><strong>db</strong>
                <ul>
                    <li><strong>DbHelper.java</strong>: Veritabanı bağlantı mantığını ve veritabanı işlemleri için yöntemleri içerir.</li>
                </ul>
            </li>
            <li><strong>entity</strong>
                <ul>
                    <li><strong>Currency.java</strong>: Para birimi varlığını temsil eder; para birimi kodu, adı ve döviz kuru için alanlar içerir.</li>
                </ul>
            </li>
            <li><strong>entityDal</strong>
                <ul>
                    <li><strong>CurrencyDal.java</strong>: Para birimi varlığı için veri erişim katmanı, CRUD (Oluşturma, Okuma, Güncelleme, Silme) işlemleri için yöntemler içerir.</li>
                </ul>
            </li>
            <li><strong>fetchers</strong>
                <ul>
                    <li><strong>CurrencyFetcher.java</strong>: Para birimi verilerini JSoup kullanarak çekmekten ve bu verileri veritabanına kaydetmek için ayrıştırmaktan sorumludur.</li>
                </ul>
            </li>
            <li><strong>ui</strong>
                <ul>
                    <li><strong>MainFrame.java</strong>: Uygulamanın ana kullanıcı arayüzü olup, döviz dönüştürme seçeneklerini ve sonuçlarını göstermeden sorumludur.</li>
                </ul>
            </li>
            <li><strong>uiController</strong>
                <ul>
                    <li><strong>MainPageController.java</strong>: Ana sayfa arayüzü için mantığı yönetir, veri ve arayüz katmanları ile etkileşimde bulunur.</li>
                    <li><strong>CurrencyConverter.java</strong>: Uygulamanın giriş noktasıdır, programın çalışmaya başladığı yerdir.</li>
                </ul>
            </li>
        </ul>
    </li>
</ul><br><br>
<h2>Gelecekteki Güncellemeler</h2>

<ul>
    <li>Kullanıcı Kimlik Doğrulama: Uygulamaya güvenli erişim sağlamak için bir giriş sayfası eklenecek.</li>
    <li>Rol Tabanlı Erişim: Yöneticiler ve Kullanıcılar için özel sayfalar oluşturulacak ve her role özel işlevler sunulacak.</li>
    <li>Thread Geliştirmesi: Performansı artırmak ve eşzamanlı işlemleri verimli bir şekilde yönetmek için uygulamaya threading (iş parçacığı) desteği eklenecek.</li>
    <li><strong>Gelişmiş Nesne Yönelimli Tasarım</strong>: Kalıtım, kodun yeniden kullanılabilirliğini artırmak ve ölçeklenebilir, temiz bir mimariyi sürdürmek için kullanılacaktır.</li>
</ul>
<br><br><br><br>
<hr>
<div style="text-align: center; font-size: 24px; font-weight: bold;">
    Example Use - Örnek Kullanım
</div>
<hr>

![output_gif](https://github.com/user-attachments/assets/63cba09f-9748-497b-8af1-79e8623a9db9)


