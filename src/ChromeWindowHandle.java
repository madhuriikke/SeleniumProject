import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jar\\selenium jar\\chromeupdate\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.bankofbaroda.com/");
		driver.manage().window();  // To maximize window
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@herf=\"https://digixp.bankofbaroda.com/kycupdate\"][@class=\"lastMenuLiA\"][@target=\"_blank\"])).Clicl();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[8]/a")).click();	
		Thread.sleep(2000);
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> it =handle.iterator();
		String firstwindow = it.next();
		String secondwindow =it.next();
		System.out.println("firstwindow:"+firstwindow);
		System.out.println("secondwindow:"+secondwindow);
		 
		driver.switchTo().window(secondwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm_ins\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divAcc\"]")).click();
		
		driver.close();
		driver.switchTo().window(firstwindow);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
