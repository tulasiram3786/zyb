//package practice.automation;
//
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class CreateOrganization {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		Random random=new Random();
//		int ranNum=random.nextInt(100);
//		//String Orgname= "TestYantra_" +ranNum;
//		
//		String orgname="TestYantra_" +ranNum;
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://localhost:8888/");
//		
//		//login to app
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("root");
//		driver.findElement(By.id("submitButton")).click();
//		
//		//navigate to organization
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		driver.findElement(By.name("accountname")).sendKeys(orgname);
//		
//		//click on save
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		//validate
//		String msg=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//		if(msg.contains(orgname))
//		{
//			 System.out.println(orgname+"verified");
//		}
//		else
//		{
//			System.out.println(orgname+"failed");
//		}
//		
//		//signout
//		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
//		
//		driver.findElement(By.linkText("Sign Out")).click();
//		
//		//close the browser
//		driver.quit();
//		
//	
//        
//        
//        
//
//	}
//
//}
