import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerySlider {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "F:\\jar\\selenium jar\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.dragAndDropBy(slider, 80, 0).perform();//move to forword
        Thread.sleep(3000);
        action.dragAndDropBy(slider, -80, 0).perform();//move to backword

	}

}
