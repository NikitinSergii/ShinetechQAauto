package cc.testPHP;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestOne extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://test.php9.cc");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Shop HP Laptops, Tablets, PCs, Monitors, Servers, and Printers | HP Online Store"));
//        driver.findElement(By.className("customer-welcome")).click();
//        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("span.customer-name")).click();
        driver.findElement(By.cssSelector("li.nav-item.authorization-link > a")).click();
        driver.findElement(By.id("customer_email")).clear();
        driver.findElement(By.id("customer_email")).sendKeys("sergii@hp.com");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("xfqrf2424N");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.xpath("//button[@id='send2']/span")).click();


    }

}
