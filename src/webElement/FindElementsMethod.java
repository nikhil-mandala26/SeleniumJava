package webElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("L0Z3Pu")).submit();
		
		List<WebElement> mobiles = driver.findElements(By.className("_4rR01T"));

		Thread.sleep(4000);
		
		for(int i=0;i<mobiles.size();i++) {
			String mobileName=mobiles.get(i).getText();
			System.out.println(mobileName);
			System.out.println(mobiles.size());
		}
		driver.close();
	}

}
