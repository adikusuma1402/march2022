package qaautomation.march2022;

import org.testng.annotations.Test;

import qaautomation.march2022.pages.CommonPage;
import qaautomation.march2022.pages.YopMailPage;
import qaautomation.march2022.utils.TestUtility;

public class SwitchIframeYopMailTest extends BaseWebTest {

	@Test
	public void yopMailTest() {
		CommonPage commonPage = new CommonPage(driver, explicitWait);
		YopMailPage yopMailPage = new YopMailPage(driver, explicitWait);

		String url = "https://yopmail.com/en/";
		String inputText = "automationtest";

		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl(url);

		yopMailPage.inputSearchText(inputText);
		yopMailPage.pressGoBtn();

		yopMailPage.switchToIframe();

		String tittleMail = yopMailPage.getTitleMail();
		System.out.println(tittleMail);

		TestUtility.hardWait(3);

	}

}
