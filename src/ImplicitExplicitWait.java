import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ImplicitExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(1l, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		
		//driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Selenium");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/ul/li[2]")).click();
		
//-------------------------Implicitly wait--------------------------------
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		.withTimeout(30,TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class)
		.withMessage("wait is ocver after 30 second");
	
		
		
		WebElement fo =wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div/div[3]/form/div[20]/div/div[1]/div/div[1]/input"));
			}
			
		});
	}
}
//-------------------------------------Explicitly wait-----------------------------		
	//WebDriverWait wait =new WebDriverWait(driver,10);
	//wait.until(ExpectedCondition.presenceOfElentLocated(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")))
		
		
		
