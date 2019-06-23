import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHyperLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com");
//-----------------------------all url links read method------------------------------------- 		
		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * System.out.println(links.size()); for(int i =0;i<links.size();i++) {
		 * //System.out.println(links.get(i).getText());//read by link name
		 * System.out.println(links.get(i).getAttribute("href"));//read by url link
		 */
//------------------------------------single url link read method-------------------------------			
			
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/h1/a/i"));
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i =0;i<links.size();i++) {
				System.out.println(links.get(i).getText());//read by link name 
				//System.out.println(links.get(i).getAttribute("href"));//read by url link
			
			
			
		}

	}

}
