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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reactdatagrid.io/docs/keyboard-navigation')

WebUI.click(findTestObject('Object Repository/Page_Keyboard navigation  Docs and API Refe_4fb8f2/div_Bill'))

//WebUI.sendKeys(findTestObject('Page_Keyboard navigation  Docs and API Refe_4fb8f2/div_Bill'), Keys.chord(Keys.DOWN))

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Page_Keyboard navigation  Docs and API Refe_4fb8f2/div_Bill'))

WebDriver webdriver = DriverFactory.getWebDriver()

Actions actions = new Actions(webdriver)

actions.moveToElement(element).click().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform()

