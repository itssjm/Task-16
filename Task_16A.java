import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Task_16A {

    public static void main(String[] args) {
        // Set Microsoft Edge driver path
        System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        
        // Initialize EdgeDriver
        WebDriver driver = new FirefoxDriver();
        

        // Maximize the browser window
        driver.manage().window().maximize();
        
        
        // Navigate to Google
        driver.get("https://www.google.co.in");


	        // Print the URL of the current page
	        System.out.println("Current URL: " + driver.getCurrentUrl());

	        // Reload the page
	        driver.navigate().refresh();

	        // Close the browser
	        driver.quit();
	    }
	}

	

