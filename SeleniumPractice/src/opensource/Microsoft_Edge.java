package opensource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Microsoft_Edge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));

        WebElement textBox = driver.findElement(By.name("username"));
        textBox.sendKeys("Admin");

        WebElement textBox1 = driver.findElement(By.name("password"));
        textBox1.sendKeys("admin123");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
