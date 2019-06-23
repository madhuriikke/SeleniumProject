import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryResizable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jar\\selenium jar\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		WebElement resizable =driver.findElement(By.xpath("/html/body/div/div[3]"));
		Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.dragAndDropBy(resizable, 300, 200).perform();
	}

}
