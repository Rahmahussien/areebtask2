import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.saucedemo.com/");
        By username = By.id("user-name");
        By pass = By.id("password");
        By loginBtn = By.id("login-button");
        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(pass).sendKeys("secret_sauce");
        driver.findElement(loginBtn).click();
        driver.quit();
    }
}
