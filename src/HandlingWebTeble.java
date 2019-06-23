import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebTeble {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/");
       // String xpath ="/html/body/div[1]/div[6]/div/div[12]/div[5]/div[3]/div/ul/li[2]/span[1]";
		
        //getting row data from table
		String start_rowxpath="/html/body/div[1]/div[6]/div/div[12]/div[5]/div[3]/div/ul/li[";
		String end_rowxpath ="]/span[1]";
		for(int i =2;i<=9;i++) {
			System.out.println(driver.findElement(By.xpath(start_rowxpath+i+end_rowxpath)).getText());;
		    System.out.println("-----------------------------");
		}
//--------------------------------------------------------------------------------------------------------		
		//getting column data from table
				String start_colxpath="/html/body/div[1]/div[6]/div/div[12]/div[5]/div[3]/div/ul/li[2]/span[";
				String end_colxpath ="]";
				for(int i =1;i<=7;i++) {
					System.out.println(driver.findElement(By.xpath(start_colxpath+i+end_colxpath)).getText());;
				    System.out.println("-----------------------------");
	}

				//getting whole data from table
				
				String start_xpath="/html/body/div[1]/div[6]/div/div[12]/div[5]/div[3]/div/ul/li[";
				String mid_xpath="]/span[";
				String end_xpath ="]";
				System.out.println("-------------Displaying tables data---------------");
				for(int i =2;i<=9;i++) {
					for(int j =1;j<=7;j++) {
					System.out.print(driver.findElement(By.xpath(start_xpath+i+mid_xpath+j+end_xpath)).getText()+"\t");
				  // System.out.println("-----------------------------");
	}
                System.out.println();
	
}
}
}