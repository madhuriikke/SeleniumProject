import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.diy.com/");
		//driver.get("https://timesofindia.indiatimes.com/");
		/*
		 * Actions actions = new Actions(driver);
		 * 
		 * 
		 * WebElement mainmenu = driver.findElement(By.xpath(
		 * "/html/body/div[1]/header/div[2]/div[1]/nav/ul/li[2]/a"));
		 * Thread.sleep(1000); WebElement submenu =driver.findElement(By.xpath(
		 * "/html/body/div[1]/header/div[2]/div[1]/nav/ul/li[2]/div/div[1]/ul/li[7]/a"))
		 * ; actions.moveToElement(mainmenu).perform(); 
		 * submenu.click();
		 */
	
	     Actions action =new  Actions(driver);
	     WebElement mainmenu =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/nav/ul/li[4]/span"));
	    
	     WebElement submenu = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/nav/ul/li[4]/ul/li[1]/a"));
	     
	     WebElement Finalmenu = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/nav/ul/li[4]/ul/li[1]/ul/li[8]/a"));
	     action.moveToElement(mainmenu).perform();
	     Thread.sleep(2000);
	     submenu.click();
	   //  action.moveToElement(submenu).perform();
	    // Finalmenu.click();
	}

	
}
