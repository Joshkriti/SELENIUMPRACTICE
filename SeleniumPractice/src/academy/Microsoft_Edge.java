package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Microsoft_Edge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("dropdown-class-example"));
        textBox.sendKeys("option2");

        WebElement textBox1 = driver.findElement(By.id("autocomplete"));
        textBox1.sendKeys("United Kingdom");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();






    }
}
