import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingImagecaptcha {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		//driver.get("https://mumbai.rrbonlinereg.com/regprint/ui_printlogin.aspx#no-back-button");
	     
		String captcha = JOptionPane.showInputDialog("Enter captcha");
	     System.out.println(captcha);
	 driver.findElement(By.xpath(" *[@id=\"imgCaptcha\"]"));
	
	
	
	
	}

}
