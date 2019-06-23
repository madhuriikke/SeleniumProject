import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("d:\\abc.jpg"));
		

	}

}
