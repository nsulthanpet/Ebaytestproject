package ebay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Validlogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();
		
		//Login to ebay
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("rajgurutest@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("n38886@987");
		driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"rmdLtr\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
		
		
		//Signout of ebay
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	
		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"gh-uo\"]/a"));
				
		int total_count = links.size();
		for (int i=0;i<total_count;i++)
			{
				WebElement element = links.get(i);
				String text = element.getAttribute("innerHTML");
					
					if (text.equalsIgnoreCase("Sign out"))
					{
						element.click();
						break;
					}			
			}		
		
		//driver.close();
	}

}
