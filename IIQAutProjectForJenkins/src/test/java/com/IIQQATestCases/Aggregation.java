package com.IIQQATestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aggregation {
	
		@Test
			public void StartAggregation() {
				
			
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(ops);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://seri.sailpointdemo.com:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
			driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin");
			driver.findElement(By.id("loginForm:loginButton")).click();
			driver.findElement(By.id("tasksSearchField-inputEl")).sendKeys("Aggregate AD Account");
			driver.findElement(By.id("ext-gen1235")).click();
			driver.quit();
			}
			@Test
			public void aggregationStatus() throws IOException {
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(ops);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.navigate().to("http://seri.sailpointdemo.com:8080/identityiq/monitor/tasks/viewTasks.jsf?resetTab=true");
				driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
				driver.findElement(By.id("loginForm:password")).sendKeys("admin");
				driver.findElement(By.id("loginForm:loginButton")).click();
				
				driver.findElement(By.id("tab-1091-btnInnerEl")).click();
				
				driver.findElement(By.id("resultsSearchField-inputEl")).sendKeys("Aggregate AD Account");
				driver.findElement(By.id("ext-gen1035")).click();
				
				TakesScreenshot t=(TakesScreenshot)driver;
				
				File src = t.getScreenshotAs(OutputType.FILE);
				File Dest=new File("./screenshot/ss.png");
				FileUtils.copyFile(src, Dest);
				//driver.quit();
				Reporter.log("welcome to Aggregation",true);
				driver.quit();
				
			}
}
