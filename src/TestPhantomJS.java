import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestPhantomJS {

	public static void main(String[] args) throws Exception {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"F:\\jar\\selenium jar\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");	
		WebDriver driver = new PhantomJSDriver(capabilities);
		driver.get("https://www.bankofbaroda.com/");
		driver.manage().window().maximize();  // To maximize window
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
		
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("d:\\abc.jpg"));
		System.out.println("Sceen shot taken");
		
		driver.close();
		System.out.println("Second window close");
		driver.switchTo().window(firstwindow);
		Thread.sleep(2000);
		driver.close();
		System.out.println("First window close");
		
		
		
		
	}

}
