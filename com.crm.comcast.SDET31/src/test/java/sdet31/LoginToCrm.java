package sdet31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToCrm {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//login to vtiger
		
		FileInputStream fis=new FileInputStream("./src/main/resources/commonData/credentials.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browser=pobj.getProperty("browser");
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		//run time polymorphism
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("launched browser is "+browser);
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("launched browser is "+browser);
		}
		else
		{
			System.out.println("specify a valid browser");
		}
		
	
 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}
		}
		
