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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://reactdatagrid.io/demo')

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Theme settings_datagrid-demo-switch__ha_41251a'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Theme settings_datagrid-demo-switch__ha_53f984'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Theme settings_datagrid-demo-switch__tr_8edbd8'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Theme settings_datagrid-demo-switch__tr_214c6e'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Color_datagrid-demo-radio__item'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Color_datagrid-demo-radio__item_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Nunito_inovua-react-toolkit-combo-box___6ea2aa'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Roboto'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/svg'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Kaleena Swapp'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/input_Name_inovua-react-toolkit-text-input__input'))

WebUI.setText(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/input_Name_inovua-react-toolkit-text-input__input'), 
    'Lorna')

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/input_Name_inovua-react-toolkit-text-input__input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Name_InovuaReactDataGrid__column-header_58d4bc'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/td_Does not equal'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Name_InovuaReactDataGrid__column-header_58d4bc'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/td_Equals'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Name_InovuaReactDataGrid__column-header_58d4bc'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/td_Clear all'))

WebUI.mouseOver(findTestObject('Page_Demo  ReactDataGrid by Inovua/div_Email'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Email_InovuaReactDataGrid__column-heade_26b77b'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/td_Sort ascending'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/dob_icon_svg_1'))

WebUI.click(findTestObject('Page_Demo  ReactDataGrid by Inovua/div_Jan 2024'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Mar'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Dec_inovua-react-toolkit-calendar__deca_d599d0'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_1967'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Feb'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_OK'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_21'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Date of birth_InovuaReactDataGrid__colu_829b1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/td_Clear all (1)'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Salary_inovua-react-toolkit-numeric-in_84daf4'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Salary_inovua-react-toolkit-numeric-in_84daf4'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Salary_inovua-react-toolkit-numeric-in_84daf4'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Salary_inovua-react-toolkit-numeric-in_af41b3'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Salary_inovua-react-toolkit-numeric-in_af41b3'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Page_inovua-react-toolkit-numeric-inpu_c96651'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/span_Page_inovua-react-toolkit-numeric-inpu_5381ba'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/next_page_svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/prev_page_svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/last_page_svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/first_page_svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_Results per page_inovua-react-toolkit-c_5e47c2'))

WebUI.click(findTestObject('Object Repository/Page_Demo  ReactDataGrid by Inovua/div_25'))

@com.kms.katalon.core.annotation.TearDown
@com.kms.katalon.core.annotation.TearDownIfFailed
@com.kms.katalon.core.annotation.TearDownIfError
@com.kms.katalon.core.annotation.TearDownIfPassed
def tearDown() {
    WebUI.closeBrowser()
}

