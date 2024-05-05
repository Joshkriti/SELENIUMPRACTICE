package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://tutorialsninja.com/demo/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("search"));
        WebElement textBox1 = driver.findElement(By.id("search"));
        textBox.sendKeys("desktop");

        WebElement Button = driver.findElement(By.tagName("button"));
        Button.click();


    }


}
