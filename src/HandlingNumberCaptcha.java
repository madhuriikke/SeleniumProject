import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingNumberCaptcha {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "F:\\jar\\\\selenium jar\\geckodriver.exe"); 
		 * WebDriver driver = new FirefoxDriver(); 
		 * driver.get("http://www.nammregister.org.uk/test.asp");
		 */
		
		
	String captcha ="10 + 1";
	int len =captcha.length();
	System.out.println(captcha);
	String first =captcha.substring(0,2);
	String last =captcha.substring(5,len);
	
	System.out.println(first);
    System.out.println(last);
    int n1 = Integer.parseInt(first);
    int n2 = Integer.parseInt(last);
    int n3 =n1 + n2;
    String res = String.valueOf(n3);
    System.out.println(res);
	}

}
