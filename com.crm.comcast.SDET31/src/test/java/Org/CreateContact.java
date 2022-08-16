package Org;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateContact {

	public static void main(String[] args) {
		
        FileInputStream fia=new FileInputStream("./src/test/resources/CreateOrganization/dataOrg.xlsx");
		
		Workbook wb = WorkbookFactory.create(fia);
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
		System.out.println("contact name is "+orgName);
		
		
		//click on organization link
		
		driver.findElement(By.xpath("//td[@class='tabSelected']//a[text()='Contacts']")).click();
		
		//click on + image
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		//enter org name
//		Random r =new Random();
//		int randomNum=r.nextInt(1000);
//		orgName=orgName+randomNum;
//		
		driver.findElement(By.name("lastname")).sendKeys(ram);
		
		//click on save
		driver.findElement(By.xpath("input[@title='Save [Alt+S]']")).click();
		
	}

}
