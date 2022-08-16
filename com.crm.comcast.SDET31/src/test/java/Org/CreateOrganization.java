package Org;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;






public class CreateOrganization {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fil=new FileInputStream("./src/test/resources/CreateOrganization/dataOrg.xlsx");
		
		Workbook wb = WorkbookFactory.create(fil);
		Sheet sh=wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		int columncount=sh.getRow(1).getLastCellNum();
		System.out.println("total number of rows count"+rowcount);
		System.out.println("total number of column count"+columncount);
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=columncount;j++)
			{
				Row r=sh.getRow(i);
				Cell c=r.getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+"        ");
				
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		String orgName=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Organization name is "+orgName);
		
//		FileInputStream fis=new FileInputStream("./src/main/resources/commonData/credentials.properties");
//		Properties pobj=new Properties();
//		pobj.load(fis);
//		String browser=pobj.getProperty("browser");
//		String url=pobj.getProperty("url");
//		String username=pobj.getProperty("username");
//		String password=pobj.getProperty("password");
//		System.out.println(browser);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
//		
//		//run time polymorphism
//				WebDriver driver=null;
//				if(browser.equals("chrome"))
//				{
//					WebDriverManager.chromedriver().setup();
//					driver=new ChromeDriver();
//					System.out.println("launched browser is "+browser);
//				}
//				else if(browser.equals("firefox"))
//				{
//					WebDriverManager.firefoxdriver().setup();
//					driver=new FirefoxDriver();
//					System.out.println("launched browser is "+browser);
//				}
//				else
//				{
//					System.out.println("specify a valid browser");
//				}
//				
//			
//		 
//				driver.manage().window().maximize();
//				driver.get(url);
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.findElement(By.name("user_name")).sendKeys("admin");
//				driver.findElement(By.name("user_password")).sendKeys("root");
//				driver.findElement(By.id("submitButton")).click();
//				
//				//click on organization link
//				
//				driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Organizations']")).click();
//				
//				//click on + image
//				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//				
//				//enter org name
//				Random r =new Random();
//				int randomNum=r.nextInt(1000);
//				orgName=orgName+randomNum;
//				
//				driver.findElement(By.name("accountname")).sendKeys(orgName);
//				
//				//click on save
//				driver.findElement(By.xpath("input[@title='Save [Alt+S]']")).click();
//				
//				
				 }
}