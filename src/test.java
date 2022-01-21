import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Ripal\\Driver\\chromedriver.exe");
		
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Ripal\\Driver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.close();
		//driver.quit();
	
	}

}
