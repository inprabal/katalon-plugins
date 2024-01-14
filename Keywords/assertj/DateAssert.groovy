package assertj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.commons.lang3.exception.ExceptionUtils
import org.apache.commons.lang3.time.DateFormatUtils
import org.apache.commons.lang3.time.DateUtils
import org.assertj.core.api.AbstractDateAssert
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

import internal.GlobalVariable

public class DateAssert {

	def Date toDate(String date, String pattern) {
		return DateUtils.parseDate(date, pattern);
	}

	def String fromDate(Date date, String pattern) {
		return DateFormatUtils.format(date, pattern)
	}

	@Keyword
	def dateAssert(DateOperator operator,Object actual,String expected,String pattern,String description, List stringSubsitutor, FailureHandling flowcontrol) {

		String actualStr= actual.toString();

		if(actual instanceof TestObject) {
			actualStr= WebUI.getText(actual, FailureHandling.STOP_ON_FAILURE);
		}



		try {
			Date actual_dt= toDate(actualStr,pattern)
			Date expected_dt = toDate(actualStr,pattern)


			switch (operator) {
				case DateOperator.IS_AFTER:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isAfter(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case DateOperator.IS_AFTER_EQUALS:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isAfterOrEqualsTo(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case DateOperator.IS_BEFORE:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isBefore(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case DateOperator.IS_BEFORE_EQUALS:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isBeforeOrEqualsTo(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case DateOperator.IS_EQUAL:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isEqualTo(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				case DateOperator.IS_NOT_EQUAL:
					(Descriptable)((AbstractDateAssert)assertThat(actual_dt).isNotEqualTo(expected_dt)).as(description, stringSubsitutor.toArray(new String[0]))
					break;
				default:
					throw new AssertionError("No Date Operator seelected");
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
