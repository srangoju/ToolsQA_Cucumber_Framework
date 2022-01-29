package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Test {
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X013810\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Brocolli");
    	String exp_message = "Brocolli - 1 Kg";
    	String actual = driver.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div > h4")).getText();
        Assert.assertEquals(exp_message, actual);
		
		driver.quit();

	}

}