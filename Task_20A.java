	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import java.util.concurrent.TimeUnit;

	public class Task_20A {
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path of ChromeDriver executable
	        System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

	        // Initialize ChromeDriver
	        WebDriver driver = new FirefoxDriver();

	        // Maximize the window
	        driver.manage().window().maximize();

	        // Navigate to the URL
	        driver.get("https://jqueryui.com/datepicker/");
	        
	        Thread.sleep(3000);
	      
	      // driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	        
	       
	        	                      

	        // Switch to the iframe that contains the datepicker
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	        
	        driver.findElement(By.cssSelector("input#datepicker")).click();

	        // Click on the next month button
	        WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	        nextMonthButton.click();

	        // Find and click on the date "22"
	        WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
	        date22.click();

	        // Extract selected date and print it
	        String selectedDate = date22.getText();
	        //System.out.println("Selected Date: " + selectedDate);
	        System.out.println("Selected date: " + driver.findElement(By.id("datepicker")).getAttribute("value"));

	        // Close the browser window and quit the WebDriver instance
	        driver.quit();
	    }
	}
