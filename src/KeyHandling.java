import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyHandling {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]")).sendKeys(Keys.BACK_SPACE);
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(
		 * "madhuriikke@gmail.");
		 * driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcdef");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Keys.ENTER);
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).sendKeys(Keys.
		 * PAGE_DOWN); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).sendKeys(Keys.
		 * PAGE_UP); Thread.sleep(2000);
		 * driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div")).
		 * sendKeys(Keys.BACK_SPACE);
		 */
        
}

}