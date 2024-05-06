package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Microsoft_Edge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/ ");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("q"));
        WebElement textBox1 = driver.findElement(By.id("small-searchterms"));
        textBox1.sendKeys("Books");

        WebElement button = driver.findElement(By.tagName("Button"));
        button.click();




    }
}
