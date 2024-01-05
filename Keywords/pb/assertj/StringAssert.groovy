package pb.assertj
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import javassist.expr.Instanceof

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import static org.assertj.core.api.Assertions.assertThat

import org.apache.commons.lang.exception.ExceptionUtils
import org.assertj.core.api.Assertions
import org.assertj.core.error.AssertionErrorMessagesAggregator
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class StringAssert {

	@Keyword
	def assertThat(StringOperator operator,Object actual,String expected,String description, List stringSubsitutor, FailureHandling flowcontrol) {

		String actualStr= actual.toString();

		if(actual instanceof TestObject) {
			actualStr= WebUI.getText(actual, FailureHandling.STOP_ON_FAILURE);
		}

		try {
 
			switch (operator) {
				case StringOperator.IS_EQUAL:
					assertThat(actualStr).as(description, stringSubsitutor.toArray(new String[0])).isEqualTo(expected)
					break;
				case StringOperator.IS_NOT_EQUAL:
					assertThat(actualStr).as(description, stringSubsitutor.toArray(new String[0])).isNotEqualTo(expected)
					break;
				case StringOperator.CONTAINS:
					assertThat(actualStr).as(description, stringSubsitutor.toArray(new String[0])).isIn(expected)
					break;
				case StringOperator.NOT_CONTAINS:
					assertThat(actualStr).as(description, stringSubsitutor.toArray(new String[0])).isNotIn(expected)
					break;
				default:
					throw new AssertionError("No String Operator seelected");
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