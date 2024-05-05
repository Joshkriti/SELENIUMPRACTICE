package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Microsoft_Edge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("search"));
        WebElement textBox1 = driver.findElement(By.id("search"));
        textBox.sendKeys("MacBook");

        WebElement Button = driver.findElement(By.tagName("button"));
        Button.click();
    }
}
