package assertj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.assertj.core.api.AbstractFloatAssert
import org.assertj.core.api.Descriptable

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import static org.assertj.core.api.Assertions.assertThat

import org.apache.commons.lang3.exception.ExceptionUtils

import internal.GlobalVariable

public class NumberAssert {


	@Keyword
	def numberAssert(NumberOperator operator,Object actual,String expected,String description, List stringSubsitutor, FailureHandling flowcontrol) {


		String actualStr= actual.toString();

		if(actual instanceof TestObject) {
			actualStr= WebUI.getText(actual, FailureHandling.STOP_ON_FAILURE);
		}
  

		try {

			float actual_flt= Float.parseFloat(actualStr)
			float expected_flt =Float.parseFloat(expected)

			switch (operator) {
				case NumberOperator.IS_GREATER:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isGreaterThan(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case NumberOperator.IS_GREATER_OR_EQUAL:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isGreaterThanOrEqualTo(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case NumberOperator.IS_LESS:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isLessThan(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case NumberOperator.IS_LESS_OR_EQUAL:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isLessThanOrEqualTo(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case NumberOperator.IS_EQUAL:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isEqualTo(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case NumberOperator.IS_NOT_EQUAL:
					(Descriptable)((AbstractFloatAssert)assertThat(actual_flt).isNotEqualTo(expected_flt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				default:
					throw new AssertionError("No Number Operator seelected");
			}
		}
		catch(AssertionError ae) {
			switch (flowcontrol) {
				case FailureHandling.CONTINUE_ON_FAILURE:
					KeywordUtil.markFailed(ExceptionUtils.getMessage(ae));
					break;
				case FailureHandling.STOP_ON_FAILURE:
					KeywordUtil.markFailedAndStop(ExceptionUtils.getMessage(ae));
					break;
				case FailureHandling.OPTIONAL:
					KeywordUtil.markWarning(ExceptionUtils.getMessage(ae));
					break;
				default:
					KeywordUtil.markFailedAndStop(ExceptionUtils.getMessage(ae));
			}
		}
	}
}
