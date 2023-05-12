package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SourceConfigure {
@Test
	
	public void LoginURL() {
	    ChromeOptions ops = new ChromeOptions();
	  	ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		String URL = driver.getCurrentUrl();
		if(URL.contains("localhost:8080/identityiq")) {
			System.out.println("Pass: correct url");
			
		}else {
			System.out.println("Please provide valid url");
		}
		driver.quit();
	}
	
	@Test
		public void ValidatingUser() {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(ops);
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
			driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin");
			driver.findElement(By.id("loginForm:loginButton")).click();
			driver.findElement(By.className("hidden-xs"));
			String accessname = driver.findElement(By.xpath("//*[@id=\"usernameMenu\"]/span")).getText();
			System.out.println("user= "+accessname);
		
	if(accessname.contains("The Administrator")) {
		System.out.println("The user spelling is correct");
		
	}else {
		System.out.println("Wrong user");
	}
	driver.quit();
}
	
	
	@Test
	public void SingleSignOnWithCorrectCredentials() {
		
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://localhost:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		String URL = driver.getCurrentUrl();
		if(URL.contains("tasks/viewTasks.jsf?resetTab=true")) {
			System.out.println("Pass: Correct Credentials");
			
		}else {
			System.out.println("Please provide Correct Credentials"+URL+"This URL is not valid");
		}
		driver.quit();
	
}
	
	
	@Test
public void SingleSignOnWithInCorrectCredentials() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admi");
		driver.findElement(By.id("loginForm:loginButton")).click();
		String URL = driver.getCurrentUrl();
		if(URL.contains("tasks/viewTasks.jsf?resetTab=true")) {
			System.out.println("Pass: CorrectCredentials");
			
		}else {
			System.out.println("Please provide CorrectCredentials");
		}
		driver.quit();
		/*File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		driver.quit();*/
}
	
	
	@Test
	
public void LandingURLAfterClickingSignOut() throws InterruptedException {
		
		//Need to work on drop down.
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("usernameMenu")).click();
		driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/ul[2]/li[4]/ul/li[4]/a")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("URL= "+url+"  Title="+title);
		driver.quit();
		/*Actions actions=new Actions(driver);
		actions.moveToElement(Logout).perform();*/
		
		
		
		
		/*Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"usernameMenu\"]/span")));
		Thread.sleep(5000);
		dropdown.selectByVisibleText("LogOut");
		driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/ul[2]/li[4]/ul/li[4]/a")).click();*/
		//String URL = driver.getCurrentUrl();
		/*if(URL.contains("tasks/viewTasks.jsf?resetTab=true")) {
			System.out.println("Pass: CorrectCredentials");
			
		}else {
			System.out.println("Please provide CorrectCredentials");
		}*/
		//driver.quit();
}
}
