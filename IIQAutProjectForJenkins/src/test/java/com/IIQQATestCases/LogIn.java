package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Utlis.Utlites;

public class LogIn {

	//@Test
	/*public void LoginwithvalidCredentials() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
		}*/
	@Test
	public void LoginWithInValidUserButWithValidPassword() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys(Utlites.generateEmailWithTimeStamp());
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
		
	}
	@Test
	public void LoginWithInValidUserAndPassword() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys(Utlites.generateEmailWithTimeStamp());
		driver.findElement(By.id("loginForm:password")).sendKeys("admi");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
		}
	@Test
	public void LoginWithValidUserAndInvalidPassword() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admi");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
		
	}
	@Test(priority = 2)
	public void LoginWithInValidUserAndValidPassword() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmi");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
		
	}
	@Test (priority = 1)
	public void LoginWithOutUserAndPassword() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));	
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/login.jsf?prompt=true");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.quit();
	
}
	
}
