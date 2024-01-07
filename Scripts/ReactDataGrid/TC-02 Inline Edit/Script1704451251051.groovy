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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reactdatagrid.io/docs/inline-edit')

WebUI.click(findTestObject('Object Repository/Page_Inline edit  Docs and API Reference  ReactDataGrid by Inovua/div_John'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Inline edit  Docs and API Reference  ReactDataGrid by Inovua/div_John'))

WebUI.clearText(findTestObject('Page_Inline edit  Docs and API Reference  ReactDataGrid by Inovua/input_inovua-react-toolkit-text-input__input'))

WebUI.setText(findTestObject('Page_Inline edit  Docs and API Reference  ReactDataGrid by Inovua/input_inovua-react-toolkit-text-input__input'), 
    'Prabal')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inline edit  Docs and API Reference  ReactDataGrid by Inovua/input_Prabal_inovua-react-toolkit-text-input__input'), 
    Keys.chord(Keys.ENTER))

