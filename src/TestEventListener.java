import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestEventListener {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		EventListener listener =new EventListener();
		EventFiringWebDriver WebDriver = new EventFiringWebDriver(driver);
		WebDriver.register(listener);
		WebDriver.get("https://www.google.com/");
		WebDriver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
		
		WebDriver.navigate().back();
		WebDriver.navigate().forward();
		
		


	}

}
