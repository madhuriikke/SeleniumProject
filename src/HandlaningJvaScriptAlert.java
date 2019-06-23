import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlaningJvaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://mail.rediff.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/p/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
	}

}
