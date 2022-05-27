package qaautomation.march2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopMailPage extends BasePageFactory {

	@FindBy(id = "login")
	private WebElement inputText;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	private WebElement goBtn;

	@FindBy(id = "ifmail")
	private WebElement iframeMail;

	@FindBy(xpath = "//div[@class='ellipsis nw b f18']")
	private WebElement tittleMail;

	public YopMailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);

	}

	public void inputSearchText(String text) {
		inputText.sendKeys(text);
	}

	public void pressGoBtn() {
		goBtn.click();
	}

	public void switchToIframe() {
		driver.get().switchTo().frame(iframeMail);

	}

	public String getTitleMail() {
		return tittleMail.getText();
	}

//	public String getSenderMail() {
//		return mailMessege.getText();
//	}
//
//	public String getitleMessege() {
//		return mailMessege.getText();
//	}

}
