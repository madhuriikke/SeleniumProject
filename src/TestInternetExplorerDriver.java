
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestInternetExplorerDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "F:\\jar\\selenium jar\\INTERNET\\IEDriverServer.exe");
		DesiredCapabilities des = DesiredCapabilities.internetExplorer();
		des.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		 WebDriver driver =new InternetExplorerDriver();
		 driver.get("https://www.facebook.com");
		
	}
}
