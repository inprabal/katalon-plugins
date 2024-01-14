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
import java.lang.StringBuffer as StringBuffer
import assertj.StringOperator as StringOperator

CustomKeywords.'assertj.StringAssert.stringAssert'(StringOperator.IS_EQUAL, 'My actual value', ['My Expected value'], 'Expected value doesn\'t match to %s', 
    ['My Expected value'], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'assertj.StringAssert.stringAssert'(StringOperator.CONTAINS, 'Eden', ['Hari', 'John', 'Eden'], 'The expected doesn\'t contains the value %s', 
    ['Eden'], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'assertj.StringAssert.stringAssert'(StringOperator.CONTAINS, 'Eden', ['Hari', 'John',], 'The expected doesn\'t contains the value %s',
	['Eden'], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'assertj.StringAssert.stringAssert'(StringOperator.NOT_CONTAINS, 'Eden', ['Hari', 'John', 'Eden'], 'The expected doesn\'t contains the value %s',
	['Eden'], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'assertj.StringAssert.stringAssert'(StringOperator.NOT_CONTAINS, 'Eden', ['Hari', 'John',], 'The expected doesn\'t contains the value %s',
	['Eden'], FailureHandling.CONTINUE_ON_FAILURE)
