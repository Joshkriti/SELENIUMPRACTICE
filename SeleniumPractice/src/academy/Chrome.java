package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("enter-name"));
        textBox.sendKeys("Komal Kanji");

        WebElement textBox1 = driver.findElement(By.id("checkBoxOption1"));
        textBox1.click();

      //  WebElement button = driver.findElement(By.tagName("button"));
        //button.click();
    }
}
