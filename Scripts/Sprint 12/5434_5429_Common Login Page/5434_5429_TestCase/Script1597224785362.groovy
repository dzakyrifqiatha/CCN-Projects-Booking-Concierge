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

'Scenario 1 - Registered and activated user of Booking Concierge will be able to login successfully using the common login page'
WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), '')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), '')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.delay(10)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge/h1_My Bookings'), 'My Bookings')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5435_5429\\SN1 - Login Success.png')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

'Scenario 2 - Registered but not acticated user of Booking Concierge login using common login page'
WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), '')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), '')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('Account is not active. Please check you email account to activate it. (We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.)', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Account not activated', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5435_5429\\SN2 - Account not activated.png')

WebUI.refresh()

'Scenario 3 - Not registered user of Booking Concierge login using common login page'
WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), '')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), '')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('A user with such email does not exist. Enter the correct email or sign up.', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Account not registered', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5435_5429\\SN2 - Account not registered.png')

WebUI.refresh()

