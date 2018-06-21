package cc.testPHP;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @After
    public void close() {
        System.out.println("test close");
        driver.findElement(By.cssSelector("span.customer-name")).click();
        driver.findElement(By.cssSelector("li.authorization-link > a")).click();
//        driver.quit();
    }
}
