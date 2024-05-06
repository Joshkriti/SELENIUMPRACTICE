package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("show-hide"));
        textBox.sendKeys("hide");

        WebElement textBox1 = driver.findElement(By.id("mousehover"));
        textBox1.sendKeys("Reload");

        WebElement textBox2 = driver.findElement(By.id("checkBoxOption2"));
        textBox2.click();



    }
}
