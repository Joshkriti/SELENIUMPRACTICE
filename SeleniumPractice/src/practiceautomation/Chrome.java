package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice-automation.com/form-fields/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("name"));
        WebElement textBox1 = driver.findElement(By.id("name"));
        textBox1.sendKeys("Komal Kanji");

        WebElement textBox3 = driver.findElement(By.id("drink1"));
        textBox3.click();

        WebElement textBox4 = driver.findElement(By.id("color1"));
        textBox4.click();

        WebElement textBox5 = driver.findElement(By.name("siblings"));
        textBox5.sendKeys("Yes");

        WebElement textBox6 = driver.findElement(By.name("email"));
        textBox6.sendKeys("Komalkanji.13@gmail.com");


        WebElement button = driver.findElement(By.tagName("submit-btn"));
        button.click();






        



    }
}
