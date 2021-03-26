# SeleniumAutomationFramework

## TechStack
- Java
- Selenium
- TestNG
- Maven
- AssertJ
- PageObjectModel, Singleton, and Factory Design Patterns
- PageFactory, By , String
- ThreadLocal -> ThreadSafety
- Extent Reports 5.0.5
- Excel Sheet for Test Data maintainence (dataprovider)
- Property or Json as config file
- Use TestNg listeners like Annotation Transformer, ItestListener, IsuiteListener
- Running tests in cloud or dockerised selenium grid
- parallel cross browser testing
- Real time dashboard with ELK images
- Using Sonarlint for clean code
- Java 8 features -> Method References, Streams, Lambdas to optimize our code
- Selenoid Integration
- Web driver manager
  - is a library which allows to automate the management of the drivers (e.g. chromedriver, geckodriver, etc.) required by Selenium WebDriver.
  - [https://github.com/bonigarcia/webdrivermanager]
  - @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
  ~~~
  <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>4.3.1</version>
    <scope>test</scope>
  </dependency>
  ~~~

