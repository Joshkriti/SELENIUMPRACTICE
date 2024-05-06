package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/ ");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("q"));
        WebElement textBox1 = driver.findElement(By.id("small-searchterms"));
        textBox1.sendKeys("gift card");

        WebElement button = driver.findElement(By.tagName("Button"));
        button.click();



    }



}
