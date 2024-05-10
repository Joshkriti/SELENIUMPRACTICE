package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Microsoft_Edge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://practice-automation.com/modals/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.id("formModal"));
        textBox.click();

        WebElement textXox1 = driver.findElement(By.name("g1051-name"));
        textXox1.sendKeys("Komal");

        WebElement textXox2 = driver.findElement(By.name("g1051-email"));
        textXox2.sendKeys("Komalkanji.13@gmail.com");

        WebElement textXox3 = driver.findElement(By.name("g1051-message"));
        textXox3.sendKeys("NO MESSAGE!!");


    }
}
