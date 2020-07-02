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

'Login Without Password Scenario'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

if (WebUI.verifyElementNotClickable(findTestObject('Page_Booking Concierge/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Sign in button unclickable', 'No')
}

WebUI.refresh()

'Login with Invalid Email Address (Email not Registered)'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), var_password)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

if (WebUI.verifyTextPresent('A user with such email does not exist. Enter the correct email or sign up.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Email Not Registered', 'No')
}

WebUI.refresh()

'Login with Invalid Email Format'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), var_password)

if (WebUI.verifyElementNotClickable(findTestObject('Page_Booking Concierge/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Sign in button unclickable', 'No')
}

'Login Success Scenario'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), var_password)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

if (WebUI.verifyElementVisible(findTestObject('Page_Booking Concierge/hq_My Bookings'), FailureHandling.CONTINUE_ON_FAILURE)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success', 'No')
} else {
    if (WebUI.verifyTextPresent('User with this email address exists', true)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Email Existed', 'No')
    }
}

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.verifyTextPresent('TEST', false)

