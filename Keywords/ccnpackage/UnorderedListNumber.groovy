package ccnpackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.lang.reflect.WeakCache.Value

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import jdk.nashorn.internal.runtime.FindProperty

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import org.omg.CosNaming.NamingContextPackage.NotFound
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class UnorderedListNumber {
	@Keyword
	def selectValueFromUnorderedList(TestObject unorderedList, Number value) {

		List<WebElement> options = WebUiCommonHelper.findWebElements(unorderedList, 30);
		if (value.equals(options.size()) ) {
			KeywordUtil.markPassed(value + "-- Number of items listed is equal");
		} else {
			KeywordUtil.markError(value + "- value - size - " + options.size() + "-- Number of items listed is NOT equal");
		}
	}
}
