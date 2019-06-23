import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentGoogle_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Salenium Project\\SeleniumProject\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> it =handle.iterator();
		String firstwindow = it.next();
		String secondwindow =it.next();
		System.out.println("firstwindow:"+firstwindow);
		System.out.println("secondwindow:"+secondwindow);
        driver.findElement(By.xpath("//*[@id=\"gb8\"]/span[1]")).click();
	}

}
