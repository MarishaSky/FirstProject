import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GoogleTest {
    @Test
    public void TestS() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.ru");

        WebElement textBox = driver.findElement(By.name("q"));

        textBox.sendKeys("selenium\n");

        // WebElement button = driver.findElement(By.name("btnK"));
        // button.click();
        // Threed.sleep (2000);

        WebElement text = driver.findElement(By.xpath("//h3[text() = 'Selenium']"));

        Assert.assertEquals(text.getText(), "Selenium");

        driver.quit();
    }
}
