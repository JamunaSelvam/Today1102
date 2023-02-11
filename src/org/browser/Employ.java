package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employ {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\today\\Selennium jj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        WebElement Username = driver.findElement(By.id("email"));
        Username.sendKeys("9944518964");
        WebElement txtpassword = driver.findElement(By.name("pass"));
        txtpassword.sendKeys("Rishi@0917");
        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();
	}

}
