import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		//driver.get("https://www.firstcry.com/");
		driver.get("https://www.lenskart.com/");
		
		
	}

}

