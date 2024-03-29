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

'Run Login Test Case under the Authentication Login folder first'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), var_password)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

if (WebUI.verifyElementVisible(findTestObject('Page_Booking Concierge/h1_My Bookings'), FailureHandling.CONTINUE_ON_FAILURE)) 
{
    CustomKeywords.'ccnpackage.LogResults.searchresult'('LOGIN SUCCESSFUL', 'no')
}
else
{
	// write another if else
	// ex. if condition email existed, message "LOGIN FAILURE - EMAIL EXIST"
	if (WebUI.verifyTextPresent('User with this email address exists', true))
	{
		CustomKeywords.'ccnpackage.LogResults.searchresult'('LOGIN FAILURE - EMAIL EXIST', 'no')
	}	
}

WebUI.takeScreenshot()

WebUI.delay(10)

