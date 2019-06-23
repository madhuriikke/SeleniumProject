import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitTest {

	public static void main(String[] args) throws InterruptedException {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("madhuri");
		driver.findElement(By.name("pass")).sendKeys("madhuri");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Email password is enterd and submit");
		
}
}