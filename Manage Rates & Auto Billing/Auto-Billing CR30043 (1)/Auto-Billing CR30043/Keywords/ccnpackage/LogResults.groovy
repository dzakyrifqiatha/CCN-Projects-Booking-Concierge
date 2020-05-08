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

import internal.GlobalVariable
import jdk.nashorn.internal.runtime.FindProperty

import org.omg.CosNaming.NamingContextPackage.NotFound
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class LogResults {
	@Keyword
	def searchresult(String Msg, String Mark) {
		if (Mark == 'Yes') {
			KeywordUtil.markPassed(Msg + " Found" ) ;
		}
		else {
			if (Mark == 'No') {
				KeywordUtil.markError(Msg + " Not found");
			}
			else{
				if (Mark == 'Ok') {
					KeywordUtil.markWarning(Msg + "");
				}
				else
					KeywordUtil.markPassed(Msg + "");
			}
		}
	}
}

