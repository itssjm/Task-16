import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class Task_16C {
	    public static void main(String[] args) {
	        // Set the path to the Chrome driver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moses\\Documents\\chromedriver-win64\\chromedriver.exe");

	        // Initialize Chrome driver
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        WebDriver driver = new ChromeDriver(options);
	        
	        // Navigate to Google
	        driver.get("https://www.google.co.in");

	        // Navigate to wikipedia.org
	        driver.get("https://www.wikipedia.org/");

	        // Find the search input element and search for "Artificial Intelligence"
	        WebElement searchInput = driver.findElement(By.id("searchInput"));
	        searchInput.sendKeys("Artificial Intelligence");
	        searchInput.submit();

	        // Wait for search results to load
	        try {
	            Thread.sleep(3000); // You can adjust the wait time as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Click on the "History" section in the search results
	        WebElement historyLink = driver.findElement(By.xpath("//div[normalize-space()='History']"));
	        historyLink.click();
	        
	        // Wait for search results to load
	        try {
	            Thread.sleep(3000); // You can adjust the wait time as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        

	        // Print the title of the section
	        WebElement sectionTitle = driver.findElement(By.id("firstHeading"));
	        System.out.println("Title of the section: " + sectionTitle.getText());

	        // Close the browser
	        driver.quit();
	    }

}
