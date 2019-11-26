package com.CRM.Potential;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Berlian.Pages.NewPotential;
import com.Berlian.Pages.PotentialModule;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;


public class Potential extends BaseTest{
	
	FileLib genlib;
	WebdriverCommonLib wcomlib;
	PotentialModule ptmod;
	NewPotential newptmod;
	
	
	@Test(priority=1)
	public void clickPotential() throws Throwable {
		genlib=new FileLib();
		wcomlib=new WebdriverCommonLib();
		ptmod=new PotentialModule(driver);
	    ptmod.setPot();
	    Thread.sleep(2000);
	   String t=wcomlib.getPageTitle();
	   
	   genlib.setCellData(EXCEL_PATH,"sheet1", 1, 6, t);
	   Thread.sleep(2000);
	   wcomlib.verifyAssert(wcomlib.getPageTitle(),genlib.getCellData(EXCEL_PATH,"sheet1", 1, 6),"Potential Page");
	   
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=2)
	public void clickPotentialName() throws Throwable
	{
		genlib=new FileLib();
		wcomlib=new WebdriverCommonLib();
		ptmod=new PotentialModule(driver);
		ptmod.setPot();
		Thread.sleep(2000);
		ptmod.setLead();
		String t=wcomlib.getPageTitle();
		genlib.setCellData(EXCEL_PATH,"sheet1",1,8,t);
		Thread.sleep(2000);
		wcomlib.verifyAssert(t,genlib.getCellData(EXCEL_PATH,"sheet1",1,8),"Potential Details Page");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ptmod.setEdit();
		String et=wcomlib.getPageTitle();
		genlib.setCellData(EXCEL_PATH,"sheet1",1,9,et);
		Thread.sleep(2000);
		wcomlib.verifyAssert(et,genlib.getCellData(EXCEL_PATH,"sheet1",1,9),"Potential Details Page in editable mode");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=4)
	public void clickPrintPview() throws Throwable
	{
		genlib=new FileLib();
		wcomlib=new WebdriverCommonLib();
		ptmod=new PotentialModule(driver);
		ptmod.setPot();
		Thread.sleep(2000);
		ptmod.setLead();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ptmod.setPrintPreview();
		String et=wcomlib.getPageTitle();
		genlib.setCellData(EXCEL_PATH,"sheet1",1,14,et);
		wcomlib.verifyAssert(et,genlib.getCellData(EXCEL_PATH,"sheet1",1,14),"Potential Details Page in editable mode");
		
	}
	@Test(priority=3)
	public void clickClone() throws Throwable
	{
		genlib=new FileLib();
		wcomlib=new WebdriverCommonLib();
		ptmod=new PotentialModule(driver);
		ptmod.setPot();
		Thread.sleep(2000);
		ptmod.setLead();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ptmod.setClone();
		String et=wcomlib.getPageTitle();
		genlib.setCellData(EXCEL_PATH,"sheet1",1,15,et);
		Thread.sleep(2000);
		wcomlib.verifyAssert(et,genlib.getCellData(EXCEL_PATH,"sheet1",1,15),"Potential Details Page in editable mode");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

	
	

}
