import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryDraggableDroppable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jar\\selenium jar\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement draggable= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement drappable =driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(draggable, drappable).perform();
		
		

	}

}
