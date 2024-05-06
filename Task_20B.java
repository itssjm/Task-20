import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_20B {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Moses/Documents/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://www.guvi.in/");
        
        Thread.sleep(1000);

        // Click on the Signup button
        WebElement signupButton = driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']"));
        signupButton.click();

        // Fill in the signup form
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("John Doe");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("johndoe152@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password123");
        
        WebElement mobnum = driver.findElement(By.id("mobileNumber"));
        mobnum.sendKeys("9876543210");

        // Submit the signup form
        WebElement signupSubmitButton = driver.findElement(By.xpath("//a[@id='signup-btn']"));
        signupSubmitButton.click();
        
        Thread.sleep(1000);

        
        
        WebElement laterbtn = driver.findElement(By.xpath("//a[@id='laterBtn']"));
        laterbtn.click();


        Thread.sleep(20000);
                
        // Close the browser
        driver.quit();
    }
}