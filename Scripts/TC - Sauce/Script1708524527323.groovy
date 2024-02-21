import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.FluentWait as FluentWait
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import java.time.Duration as Duration

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

//WebDriver driver = new ChromeDriver();
// Navigate to a URL
//driver.get("https://www.saucedemo.com/");
WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Accepted usernames arestandard_userlock_f87578'))

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Accepted usernames arestandard_userlock_f87578'))

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Accepted usernames arestandard_userlock_f87578'))

WebUI.setText(findTestObject('Object Repository/scdemo/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Password for all userssecret_sauce'))

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Password for all userssecret_sauce'))

WebUI.setEncryptedText(findTestObject('Object Repository/scdemo/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/input_Swag Labs_login-button'))

//WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Sauce Labs Fleece Jacket'))
//WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Add to cart'))
//WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Add to cart_1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Sauce Labs Onesie'), 5)

WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/div_Sauce Labs Onesie'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Add to cart'), 5)
WebUI.click(findTestObject('scdemo/Page_Swag Labs/button_Add to cart_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Remove_1'), 5)


WebUI.click(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Remove_1'))
WebUI.waitForElementPresent(findTestObject('Object Repository/scdemo/Page_Swag Labs/button_Remove_1'), 10)
