package pompages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory;

public class CoreJavaForSeleniumPage {
	//Declaration
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	@FindBy(xpath="//a[text()='core java for selenium trainin']")
private WebElement corejavaForSeleniumLink;
	
	//Initialization
	public coreJavaSeleniumPage(WebDriver driver) {
		pageFactory.initElements(driver,this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void clickcorejavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}
}
