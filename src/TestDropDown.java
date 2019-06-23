import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com");
	    WebElement element =driver.findElement(By.xpath("//*[@id=\"month\"]"));//.sendKeys("nov");
		
		//WebElement element =driver.findElement(By.xpath("//*//*[@id="DistrictCode_Login"]"));
		Select select =new Select(element);
		Thread.sleep(2000);
		select.selectByVisibleText("Jan");
       //select.selectByValue("AHM");
		//select.selectByIndex(5);
		
//--------------------------------whole page drop down mehod--------------------		
		/*
		 * List<WebElement> options =select.getOptions();
		 * System.out.println(options.size()); for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText());
		 */
			//System.out.println(options.get(i).getAttribute("value"));
			
//--------------------------------------single drop down ---------------------			
			/*List<WebElement> options = driver.findElements(By.tagName("option"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++) {
				//System.out.println(options.get(i).getText());
				System.out.println(options.get(i).getText());
			*/
		
		/*
		 * WebElement element =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		 * List<WebElement> options = element.findElements(By.tagName("option"));
		 * System.out.println(options.size()); for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText());
		 * //System.out.println(options.get(i).getAttribute("value"));
		 * }
		 */
	}
	

}
