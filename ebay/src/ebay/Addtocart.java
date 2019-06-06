package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addtocart {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		// Search process
		
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("bose headphones");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[5]/div/div/div/div[2]/div/div[4]/div/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[2]/span[2]/button")).click();
		
		//driver.close();
	}

}
