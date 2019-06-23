import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.navigate().to("https://www.Google.com/");
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[7]/div[1]/div/div/div/div/span[2]/a[3]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
	
	
	}

}
