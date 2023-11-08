package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement loginButton=driver.findElement(By.xpath("//button[.=\"Log in\"]"));
			System.out.println(loginButton.getCssValue("color"));
			System.out.println(loginButton.getCssValue("font"));
			System.out.println(loginButton.getCssValue("background-color"));
			
			driver.close();

	}

}
