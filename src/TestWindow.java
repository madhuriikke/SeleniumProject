import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWindow {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://sharekhan.com");
		
		Set<String> handle =driver.getWindowHandles();

		Iterator<String>it= handle.iterator();
		
		String mainwindow =it.next();
		System.out.println(mainwindow);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div/div[2]/ul/li[3]/a[1]")).click();
	    driver.switchTo().window(mainwindow);
	    handle =driver.getWindowHandles();
	    it =handle.iterator();
	    System.out.println("-----------After Clicking----------");
	    mainwindow =it.next();
	    String nextwindow =it.next();
	    System.out.println(mainwindow);
	    System.out.println(nextwindow);
	    driver.switchTo().window(nextwindow);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input")).sendKeys("Madhuri Ikke");
	    Thread.sleep(2000);
	    driver.close();
	    
	    driver.switchTo().window(mainwindow);
	    Thread.sleep(2000);
	    driver.close();
	    
		
	
	}

	
}
