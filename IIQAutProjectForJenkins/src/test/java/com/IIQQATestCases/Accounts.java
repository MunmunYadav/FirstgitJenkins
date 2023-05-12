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
import org.testng.annotations.Test;

public class Accounts {
@Test
	
	public void RemovelOfAccount() throws InterruptedException, IOException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://seri.sailpointdemo.com:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Aaron Nichols");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//div/button[contains(.,'Manage')]")).click();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./screenshot/ss.png");
		FileUtils.copyFile(src, Dest);
		/*Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"dropDownMenuButton-0a0000fa80ce18ff8180ce2abb783ad7\"]/i"))).click().build().perform();
		Thread.sleep(5);
		a.moveToElement(driver.findElement(By.className("ng-binding"))).click().build().perform();
		//need to work on drop down button
		//driver.findElement(By.xpath("//*[@id=\"row-0-column-5-Actions\"]/span/sp-manage-account-actions/div/div/fieldset/sp-drop-down-menu-button/ul/li/a")).click();
		/*String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);*/
		driver.quit();
	

}


}
