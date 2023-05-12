package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class UIConfiguration {
	@Test (priority = 1)
	public void productbranding() {
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
		
		driver.findElement(By.xpath("//*[@id=\"topHeader\"]/img")).getAttribute("alt");
		driver.quit();
       
	}
	@Test
	public void Navigationbarcolour() {
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
		String colors = driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav")).getCssValue("color");
		System.out.println("color ="+colors);
		driver.quit();
	
		
	}
	@Test
	public void BrandLogo() {
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
		 
		boolean logo = driver.findElement(By.xpath("//*[@id=\"topHeader\"]/img")).isDisplayed();
		  if(logo==true) {
			  System.out.println("Logo is display: pass");
		  }else {
		System.out.println("logo is not display:Fail");
	
		  }
		  driver.quit();

}
	
}
