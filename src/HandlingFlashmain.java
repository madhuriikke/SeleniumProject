import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingFlashmain {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com/watch?v=AiFWkcMSWtc");
		
		HandlingFlash flashObj = new HandlingFlash(driver,"ytplayer");
		
		Thread.sleep(10000);
		
		flashObj.call("pauseVideo");
		Thread.sleep(4000);
		flashObj.call("playVideo");
		Thread.sleep(4000);
		flashObj.call("mute");
		Thread.sleep(4000);
		flashObj.call("unMute");
		

	}

}
