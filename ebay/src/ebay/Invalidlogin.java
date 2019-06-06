package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invalidlogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();
		
		//Login to ebay
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("rajgurutest@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("n1234@987");
		driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

}
