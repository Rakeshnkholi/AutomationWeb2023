package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class Daily_Station_ReportPage extends Baseclass 
{
	WebDriver ldriver;
	
	public Daily_Station_ReportPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Daily Station Report']")
	private WebElement stationreport;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']")
	private WebElement servicelocation;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']//ul//li//div")
	private List<WebElement> servicelocationList;
	
	@FindBy(xpath="//div[@id='station-id-reports']")
	private WebElement stationID;
	
	@FindBy(xpath="//div[@id='station-id-reports']//ul//li//div")
	private List<WebElement> staionIDlist;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	
	
	public void clickonDailyStationReport()
	{
		mousehover(stationreport);
		webdriverwait(stationreport);
		
	}
	
	public void servicelocationlist(String location1, String location2) throws InterruptedException
	{
		webdriverwait(servicelocation);
		for(int i=0;i<servicelocationList.size(); i++)
		{
			if(servicelocationList.get(i).getText().contains(location1))
			{
				servicelocationList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		for(int i=0;i<servicelocationList.size(); i++)
		{
			if(servicelocationList.get(i).getText().contains(location2))
			{
				servicelocationList.get(i).click();
				break;
			}
		}
	}
	
	public void stationIDlist(String ID1,String ID2) throws InterruptedException
	{
		webdriverwait(stationID);
		
		for(int i=0;i<staionIDlist.size();i++)
		{
			if(staionIDlist.get(i).getText().contains(ID1))
			{
				staionIDlist.get(i).click();
			}
		}
		
		Thread.sleep(3000);
		for(int i=0;i<staionIDlist.size();i++)
		{
			if(staionIDlist.get(i).getText().contains(ID2))
			{
				staionIDlist.get(i).click();
			}
		}
		
	}
	
	public void selctdate(String value)
	{
		webdriverwait(date);
		for(int i=0;i<dateoptions.size(); i++)
		{
			if(dateoptions.get(i).getText().contains(value))
			{
				dateoptions.get(i).click();
				break;
			}
		}
	}
	public void clickonsubmit()
	{
		webdriverwait(submit);
	}
	
	

}
