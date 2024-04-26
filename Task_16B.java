import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Task_16B {
	    public static void main(String[] args) {
	        // Set the path to the Chrome driver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moses\\Documents\\chromedriver-win64\\chromedriver.exe");

	        // Initialize Chrome driver
	        WebDriver driver = new ChromeDriver();

	      
	        // Navigate to DemoBlaze website
	        driver.get("https://www.demoblaze.com/");
	        
	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Verify if the title of the page is "STORE"
	        String pageTitle = driver.getTitle();
	        if (pageTitle.equals("STORE")) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }
	        
	        // Add a wait of 5 seconds
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
}


