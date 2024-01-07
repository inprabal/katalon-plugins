import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.time.Duration as Duration
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reactdatagrid.io/docs/row-reorder')

WebElement element_from = WebUiBuiltInKeywords.findWebElement(findTestObject('Page_Row reorder via drag-and-drop  Docs and API Reference  ReactDataGrid by Inovua/div_InovuaReactDataGrid__cell__content'))

WebElement element_to = WebUiBuiltInKeywords.findWebElement(findTestObject('Page_Row reorder via drag-and-drop  Docs and API Reference  ReactDataGrid by Inovua/div_Billy (1)'))

WebDriver webdriver = DriverFactory.getWebDriver()

Actions actions = new Actions(webdriver)

actions.moveToElement(element_from).pause(Duration.ofSeconds(1)).clickAndHold(element_from).pause(Duration.ofSeconds(1)).moveToElement(
    element_to).pause(Duration.ofSeconds(1)).release(element_to).build().perform()

not_run: WebUI.dragAndDropToObject(findTestObject('Page_Row reorder via drag-and-drop  Docs and API Reference  ReactDataGrid by Inovua/div_InovuaReactDataGrid__cell__content'), 
    findTestObject('Page_Row reorder via drag-and-drop  Docs and API Reference  ReactDataGrid by Inovua/div_Billy (1)'))

