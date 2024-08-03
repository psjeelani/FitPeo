package PageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class FitPeoRCPage extends BasePage{
	
	public FitPeoRCPage(WebDriver driver)
	{
		super(driver);

	}
	
	@FindBy (xpath="//div[text()='Revenue Calculator']")
	WebElement btn_RevenueCalculator;
	
	@FindBy (xpath="//h4[text()='Medicare Eligible Patients']")
	WebElement element;
	
	@FindBy (xpath="//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']")
	WebElement SlideBar;
	
	@FindBy (xpath="//input[@type='number']")
	WebElement TextBox;
	
	@FindBy (xpath="//p[text()='CPT-99453']")
	WebElement CPT;
	
	@FindBy (xpath="//span[text()='57']")
	WebElement Checkbox1;
	
	@FindBy (xpath="//span[text()='19.19']")
	WebElement Checkbox2;
	
	@FindBy (xpath="//span[text()='63']")
	WebElement Checkbox3;
	
	@FindBy (xpath="//span[text()='15']")
	WebElement Checkbox4;
	
	@FindBy (xpath="//div//p[4]//p[@class='MuiTypography-root MuiTypography-body1 inter css-hocx5c']")
	WebElement TotalRR;
	
	
	
	
	
	
	public void click_RevenueCalculator()
	{
		btn_RevenueCalculator.click();
	}

	public void Scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public void Adjust_Slidebar() throws Exception
	{
		Actions act=new Actions(driver);
	    act.clickAndHold(SlideBar).moveByOffset(-26, 0).release().perform();
	    Thread.sleep(2000);
	    act.clickAndHold(SlideBar).moveByOffset(-200, 0).release().perform();

	}
	
	public void Update_TextBox() throws Exception
	{
        TextBox.clear();	   
	    TextBox.sendKeys("560");
	
	}
	
	
	public void Scrolldown_CPT()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();",CPT);
	}
	
	public void Checkboxe1()
	{
		Checkbox1.click();
	}
	
	public void Checkboxe2()
	{
		Checkbox2.click();
	}
	
	public void Checkboxe3()
	{
		Checkbox3.click();
	}
	
	public void Checkboxe4()
	{
		Checkbox4.click();
	}
	
	public void ValidateRR()
	{
		String expected="$75600";
		String actual=TotalRR.getText();
	
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();		
		System.out.println("Test is Passed");
	}
	
	
}
