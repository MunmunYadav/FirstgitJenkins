package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utlis.Utlites;

public class AccountCreation {
	@Test
	public void UniqueAccount() throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/identities/identities.jsf#/quickLinks/Create+Identity/createIdentity");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		//Generating Unique First name
		driver.findElement(By.id("field-0a0000fa80ce14a88180ce15c85a012b-firstname")).sendKeys(Utlites.generateFirstNameWithTimeStamp());
		driver.findElement(By.id("field-0a0000fa80ce14a88180ce15c85a012b-lastname")).sendKeys("Yadav");
		//Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.className("fa fa-chevron-down"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dropdown).click().perform();
		//actions.click(dropdown).perform();
	}

}
