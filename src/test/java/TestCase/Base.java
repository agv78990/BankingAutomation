package TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

;

public class Base {
    public String baseUrL="http://demo.guru99.com/v4/";
    public String userName="mngr316486";
    public String pasword="hAqAgaq";
    public static WebDriver driver;
    public static Logger logger;

@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\avaho\\IdeaProjects\\I\\BankingAutomation\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();

    org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger("ebanking");
    PropertyConfigurator.configure("log4j.properties");


    }
    @AfterClass
    public void exit() throws InterruptedException {
    driver.quit();
    Thread.sleep(5000);
    }
}
