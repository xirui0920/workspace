package xirui.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Main {  
	public static WebDriver driver;  
	public static void main(String[] args)  {   
				System.out.print("开始web自动化!!");   
				driver =new InternetExplorerDriver();  
//				System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");   
				driver.get("http://192.168.8.13:8056/webmaster/login.jsp");   
//				driver.findElement(By.linkText("登录")).click();  
				WebElement username = driver.findElement(By.name("username"));
				username.sendKeys("admin");
				WebElement pwd = driver.findElement(By.id("password"));
				pwd.sendKeys("111111");
				WebElement login = driver.findElement(By.id("loginBtn"));
				login.click();
//				driver.close();
	} 				
}