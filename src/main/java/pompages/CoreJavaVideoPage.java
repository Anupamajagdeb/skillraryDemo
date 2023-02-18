package pompages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CoreJavaVideoPage {
	//Declaration
	@FindBy(xpath="//h1")
	private WebElement pageHeader;
	
	@FindBy(xpath="//button[@aria-label='play']")
private WebElement playButton;
	
	@FindBy(xpath="//button[@aria-label='pause']")
	private WebElement playPause;
	
	@FindBy(xpath="//span[text()=Add To wishlist']")
	private WebElement addToWishlistTab;
	
	//Initialization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickPlayButton() {
		playButton.click();
	}
	public void clickPauseBuuton() {
		pauseButton.click();
	}
	public void clickAddToWishlist() {
		addToWishlist.click();
	}
}
