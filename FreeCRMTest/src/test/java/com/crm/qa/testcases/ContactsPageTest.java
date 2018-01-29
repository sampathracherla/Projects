package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName = "contacts";
	
	public ContactsPageTest(){
		super();
	}

    @BeforeMethod
    public void setUp()
    {
    	initialization();
    	testUtil = new TestUtil();
    	contactsPage = new ContactsPage();
    	loginPage = new LoginPage();
    	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    	testUtil.switchToFrame();
    	contactsPage = homePage.clickOnContactsLink();
    }
    @Test(priority = 1)
    public void verifyContactsPageLabel()
    {
    Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");	
    }

 
    @DataProvider
    public Object[][] getCRMTestData() throws InterruptedException
    {
   	Object data [][]=TestUtil.getTestData(sheetName);
   	return data;
   }
   
    @Test(priority = 2, dataProvider="getCRMTestData")
     public void validateCreateNewContact(String title, String firstname, String lastname, String company) throws InterruptedException
 //  @Test(priority = 2)
 //   public void validateCreateNewContact()
    {
    	homePage.clickOnContactsLink();
       	homePage.clickOnNewContactLink();
 //   	contactsPage.createNewContact("Mr.", "Liang", "James", "Flipkart");
        contactsPage.createNewContact(title, firstname, lastname, company);
    }
                
    @AfterMethod
    public void tearDown(){
    driver.close();
    }
}
