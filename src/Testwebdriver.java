import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testwebdriver {

	public static void main(String[] args) throws InterruptedException {
		                         //key                        //value
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\selenium jar\\geckodriver.exe");
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		/*
		 * WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 * element.sendKeys("madhuri@gmail.com");
		 * 
		 * element =driver.findElementById("pass"); 
		 * element.sendKeys("123");
		 * 
		 * element = driver.findElementByXPath("//*[@id=\"u_0_2\"]"); 
		 * element.click();
		 * 
		 * 
		 * element =driver.findElementByXPath("/html/body/div[1]/div[3]/div[3]/div/div/div");
		 * System.out.println(element.getText());
		 */
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("madhuri@gmail.com");
		driver.findElementById("pass").sendKeys("123");
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"u_0_2\"]").click();
		
		System.out.println(driver.findElementByXPath("/html/body/div[1]/div[3]/div[3]/div/div/div").getText());
	}
	
	

}
