package limitingScope;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement footer=driver.findElement(By.id("pageFooter"));
		
		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
        
		Thread.sleep(4000);
		
		for(int i=0;i<footerLinks.size();i++) {
			String linkText=footerLinks.get(i).getText();
			System.out.println(linkText);
		}
		driver.close();
	}

}
