import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jar\\selenium jar\\chromeupdate\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("madhuriikke2@gmail.com");
	}
}

