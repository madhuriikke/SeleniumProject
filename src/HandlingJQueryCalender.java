import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingJQueryCalender {

	static int currentDay = 0, currentMonth = 0, currentYear = 0;
	static int targetDay = 0, targetMonth = 0, targetYear = 0;

	static int jumpBy = 0;
	static boolean flag = true;

	public static void main(String[] args) throws Exception {
		String targetDate = "15/9/2019";
		getCurrentDayMonthYear();
		System.out.println(currentDay + " " + currentMonth + " " + currentYear);
		getTargetDateMonthYear(targetDate);
		System.out.println(targetDay + " " + targetMonth + " " + targetYear);
		getJumpBy();

		System.setProperty("webdriver.gecko.driver", "F:\\jar\\\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com//resources//demos//datepicker//default.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		for (int i = 0; i < jumpBy; i++) {
			if (flag == true) {
				driver.findElement(By.xpath("/html/body/div/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("/html/body/div/div/a[1]/span")).click();
			}
			Thread.sleep(2000);
		}
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
	}

	public static void getCurrentDayMonthYear() {

		Calendar calendar = Calendar.getInstance();

		currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		currentMonth = (calendar.get(Calendar.MONTH)) + 1;
		currentYear = calendar.get(Calendar.YEAR);

	}

	public static void getTargetDateMonthYear(String date) {

		String[] finalDate = date.split("/");
		targetDay = Integer.parseInt(finalDate[0]);
		targetMonth = Integer.parseInt(finalDate[1]);
		targetYear = Integer.parseInt(finalDate[2]);
	}

	public static void getJumpBy() {
		if (targetMonth - currentMonth > 0) {
			jumpBy = targetMonth - currentMonth;
		} else {
			jumpBy = currentMonth - targetMonth;
			flag = false;
		}

	}

}
