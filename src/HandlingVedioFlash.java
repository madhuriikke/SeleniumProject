import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingVedioFlash {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=no5oZFnY_s8");
		
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[3]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[27]/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
	}

}
