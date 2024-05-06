package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/ ");

        String  title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("customerCurrency"));
        WebElement textBox1 = driver.findElement(By.id("customerCurrency"));
        textBox1.sendKeys("euro");

        WebElement button = driver.findElement(By.tagName("Button"));
        button.click();





    }
}
