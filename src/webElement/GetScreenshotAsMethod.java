package webElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAsMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement foodImage=driver.findElement(By.className("_2h2bu"));
		
		File src =foodImage.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/foodImage.png");
		
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
		

	}

}
