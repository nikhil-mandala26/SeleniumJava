package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		int count=0;
		while(count<10) {
			try {
				WebElement title=driver.findElement(By.xpath("//td[text()=\"Enter Time-Track\"]"));
				System.out.println(title.getText());
				break;
			}
			catch(Exception e) {
				count++;
				Thread.sleep(6000);
				
			}
			driver.close();
		}
		

	}

}
