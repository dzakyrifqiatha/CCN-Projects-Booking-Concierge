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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), Log_Email)
WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), Log_Password)
WebUI.focus(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))
WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 3,
	FailureHandling.OPTIONAL)) {
WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), findTestData('Regression').getValue(
	'Log_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
} 

WebUI.refresh()	


