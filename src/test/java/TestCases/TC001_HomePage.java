package TestCases;

import org.testng.annotations.Test;
import PageObjects.FitPeoRCPage;
import TestBase.BaseClass;

public class TC001_HomePage extends BaseClass
{
	@Test(priority=1)
	public void RevenueCalculator() throws Exception
	{
	
    FitPeoRCPage fp=new FitPeoRCPage(driver);	

    fp.click_RevenueCalculator();
	Thread.sleep(3000);
	
	fp.Scrolldown();
	Thread.sleep(2000);
	
	fp.Adjust_Slidebar();
	Thread.sleep(2000);
	
	fp.Update_TextBox();
	Thread.sleep(2000);
	
	fp.Scrolldown_CPT();
	Thread.sleep(2000);
	
	fp.Checkboxe1();
	Thread.sleep(2000);
	
	fp.Checkboxe2();
	Thread.sleep(2000);
	
	fp.Checkboxe3();
	Thread.sleep(2000);
	
	fp.Checkboxe4();
	Thread.sleep(2000);
	
	fp.ValidateRR();
	Thread.sleep(2000);

	
}
}