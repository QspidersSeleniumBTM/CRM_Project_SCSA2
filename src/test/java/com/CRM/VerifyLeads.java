package com.crm.leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebdriverCommonLib;
import com.crm.pages.CreateLead;
import com.crm.pages.LeadDetails;
import com.crm.pages.LeadsPage;
import com.crm.pages.NewLead;

public class VerifyLeads extends BaseTest {
	
	
	LeadsPage ldspg;
	NewLead  ldsbtn;
	CreateLead crld;
	LeadDetails ldetail;
	WebdriverCommonLib wc;
	@Test(enabled = true)
	public void checkleadsListPage() 
	{
		ldspg=new LeadsPage(driver);
		
		ldspg.leadsmod();
		
		//Reporter.log(driver.getTitle(), true);
		Reporter.log("Leads List Page is Displayed==> PASSED",true);
	}
	@Test(enabled = true)
	public void createNewLead() 
	{
		ldsbtn=new NewLead(driver);
        ldsbtn.clicknewleadsbtn();
        //Reporter.log(driver.getTitle(),true);
        Reporter.log("New Lead Page is Displayed==> PASSED",true);
	}
	
	@Test(enabled = true)
	public void createlead() 
	{
		crld=new CreateLead(driver);
        crld.fname();
        crld.desgname();
        crld.compname();
        crld.lastname();
        crld.savebtn();
        //Reporter.log(driver.getTitle(),true);
        Reporter.log(" Create lead Page is Displayed==> PASSED",true);
	}
	@Test(enabled = true)
	public void leadDetails()
	{
		ldetail=new LeadDetails(driver);
	    //Reporter.log(driver.getTitle(),true);
	    Reporter.log("Leads Details Page is Displayed==> PASSED",true);
		
	}
}
