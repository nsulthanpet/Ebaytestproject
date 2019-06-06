package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Avengers");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Candidate");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rajgurutest@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("n38886@987");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"showPASSWORD\"]/ul/li/span[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ppaFormSbtBtn\"]")).click();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"gh-ug\"]")).click();
		//driver.close();

	}

}
