package tediTestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TEDIHomepage{
	// open the tedisrp page
	WebDriver driver = new ChromeDriver();
	 
	@Test (priority =1)
	
	public void page(){
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tedihsrp.com/");
		System.out.println("open browser");
		
	}
	@Test (priority =2)
	public void Gov() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='qcvR8RFm1EUDM0tCwdpa']")).click();
		driver.get("https://tedihsrp.com/govt-notifications");
        driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(@class,"
				+ "'Ei0ZUGw1LMhWXksBUQNw Uy7QuFs2brS45Yk8WiPX')]//a[1]")).click();
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		WebElement  hsrp  = driver.findElement(By.xpath("//div[text()='Benifits of HSRP']"));
		Actions action = new Actions(driver);
		action.moveToElement(hsrp).moveByOffset(10, 10).click().perform();
		System.out.println(" Gov ");
		}
	
	// who we are
	@Test (priority =3)
	public void Tedi() throws InterruptedException {
		
	WebElement  tedi  = driver.findElement(By.xpath("//div[text()='tedi hsrp']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(tedi).moveByOffset(7, 7).click().perform();
	Thread.sleep(7000);
	WebElement tediev = driver.findElement(By.xpath("//div[text()='tedi ev']"));
	Actions actions1 = new Actions(driver);
	actions1.moveToElement(tediev).moveByOffset(7, 7).click().perform();
	Thread.sleep(7000);
//	driver.findElement(By.xpath("(//div[@class='fq3_7y8M70nBrS7kFAF0 col'])[3]")).click();
    WebElement tediins = driver.findElement(By.xpath("//div[text()='tedi insurance']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(tediins).moveByOffset(7, 7).click().perform();
	Thread.sleep(4000);
	WebElement tediindia = driver.findElement(By.xpath("//div[text()='tedi india pvt ltd']"));
	Actions actions3 = new Actions(driver);
	actions3.moveToElement(tediindia).moveByOffset(7, 7).click().perform();
	System.out.println("tedi");
	
     	
	}

	@Test (priority =4)
	public void socialmedia() throws InterruptedException {
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//img[@src='/static/media/Instagram.6d86c75b32bef53cc530.png']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	 	driver.quit();
	}
//	@Test (priority =5)
//		public void footer() {
//			driver.findElement(By.xpath("//a[@href='/terms&Conditions']//div[1]")).click();
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/terms&Conditions']//div[1]")));
////		element.click();

			

		}



    
	
	
		
		
	
	
	
		

	


