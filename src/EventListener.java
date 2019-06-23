import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class EventListener extends AbstractWebDriverEventListener {
	
	 public void afterClickOn(WebElement element , WebDriver driver) {
		 System.out.println("Click event occured");
		 
	 }
	 public void afterNavigateForward(WebDriver driver) {
		 System.out.println("Forwording page");
	 }
}
